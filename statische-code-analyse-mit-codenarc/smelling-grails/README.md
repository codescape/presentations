smelling-grails
===================

Introduction
------------
This project shows how to use the CodeNarc plugin for Grails in a simple project.

Usage
------------

Create a new application

	grails create-app smelling-grails

	cd smelling-grails

Create domain classes

	grails create-domain-class Talk
	grails create-domain-class Speaker

	class Talk {
		String title
		Date date
		Speaker speaker
	
		static constraints = {}

		String toString() {
			"Talk: $title [$date] (by $speaker)"
		}
	}

	class Speaker {
		String firstname
		String lastname
		String email
	
		static constraints = {
			email(email:true)
		}
	
		String toString() {
			"$firstname $lastname ($email)"
		}
	}

Create controllers

	grails create-controller Talk
	grails create-controller Speaker

	class TalkController {
		static scaffold = true
	}

	class SpeakerController {
		static scaffold = true
	}

Run the application

	grails run-app

Install CodeNarc plugin

	grails install-plugin codenarc

Run the CodeNarc inspection

	grails codenarc

Let's get dirty

	class TalkController {
		static scaffold = true
	
		def AbsoluteAntiPatternPublicMethod(int value = 0) {
			(value = 1) ?: "Hello World"
		}
	}

	class SpeakerTests extends GrailsUnitTestCase {
		void testSomething() {
			try {
				new Speaker().firstname.contains('a')
			} catch(NullPointerException npe) {}
		}
	}

Run the CodeNarc inspection again

	grails codenarc
