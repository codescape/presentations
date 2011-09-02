smelling-groovy
===================

Introduction
------------
This project shows how CodeNarc can be applied to a Gradle project.

Usage
------------

First let us run the tests and verify everthing works fine

	gradle check


Now lets add the code-quality plugin

	open build.gradle
	
	uncomment // apply plugin: 'code-quality'

Run the code-quality plugin

	gradle check

But... I don't want my evil code let the build break!

	open build.gradle
	
	uncomment // [codenarcMain, codenarcTest]*.ignoreFailures = true 

Run the code-quality plugin again

	gradle check
