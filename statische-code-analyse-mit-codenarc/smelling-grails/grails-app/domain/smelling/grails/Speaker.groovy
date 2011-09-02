package smelling.grails

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
