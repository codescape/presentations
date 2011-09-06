package smellicious

/** EmptyStaticInitializer, EqualsAndHashCode, AbstractClassWithoutAbstractMethod, UnnecessaryReturnKeyword */
abstract class CodeMonster {
	static { }
	int hashCode() { return 1 }
}
