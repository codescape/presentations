package smelling.grails

class Talk {
    String title
    Date date
    Speaker speaker

    static constraints = {}

    String toString() {
        "Talk: $title [$date] (by $speaker)"
    }
}
