package quiz

class Question {
    String text
    static hasMany = [answers: Answer]

    static constraints = {
        text(blank: false, unique: true)
    }

    String toString() { text }
}
