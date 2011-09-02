package smelling.grails

class TalkController {
    static scaffold = true

    def AbsoluteAntiPatternPublicMethod(int value = 0) {
        (value = 1) ?: "Hello World"
    }
}
