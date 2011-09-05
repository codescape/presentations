package quiz

class Answer {
    String text
    boolean correct
    static belongsTo = [question: Question]

    static constraints = {
        text(blank: false)
    }

    String toString() { text }
}
