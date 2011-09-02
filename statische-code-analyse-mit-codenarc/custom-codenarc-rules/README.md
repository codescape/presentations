Custom Rules for CodeNarc
=========================

Checkout the sources from SourceForge

	svn checkout https://codenarc.svn.sourceforge.net/svnroot/codenarc codenarc
	
	cd codenarc
	
	cd trunk

Build the CodeNarc project with Maven

	mvn install -DskipTests

Create a new rule with the provided CodeNarc script

	groovy codenarc.groovy create-rule
	
Follow the instructions of the wizard

	Provide author name, rule name, rule category and rule description when requested.

Implement the test that has prebuilt test cases for no violation, one violation and two violations

	class AvoidPrintStackTraceRuleTest extends AbstractRuleTestCase {
	
		// ..
	
		void testSuccessScenario() {
			final SOURCE = '''
				println('..')
				printStackTrace(1)
			'''
			assertNoViolations(SOURCE)
		}
	
		void testSingleViolation() {
			final SOURCE = '''
				this.printStackTrace()
				printStackTrace()
			'''
			assertTwoViolations(SOURCE,
				2, 'this.printStackTrace', 'Avoid printStackTrace(). Use a logger!',
				3, 'printStackTrace', 'Avoid printStackTrace(). Use a logger!')
		}
	
		// ..
	
	}

Run the tests again and verify the violations tests fail

Implement the rule

	class AvoidPrintStackTraceRule extends AbstractAstVisitorRule {
		String name = 'AvoidPrintStackTrace'
		int priority = 2
		Class astVisitorClass = AvoidPrintStackTraceAstVisitor
	}
	
	class AvoidPrintStackTraceAstVisitor extends AbstractAstVisitor {
		@Override
		void visitMethodCallExpression(MethodCallExpression call) {
			if (AstUtil.isMethodNamed(call, 'printStackTrace', 0)) {
				addViolation(call, 'Avoid printStackTrace(). Use a logger!')
			}
			super.visitMethodCallExpression(call)
		}
	}

Run the test again and verify all tests run successfully

Create a patch and file a feature request with the patch attached in the CodeNarc issue tracker