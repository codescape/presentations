package smelling.grails

import grails.test.*

class SpeakerTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testSomething() {
        try {
            new Speaker().firstname.contains('a')
        } catch(NullPointerException npe) {}
    }
}
