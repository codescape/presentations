package quiz

class QuizController {
    def index = {
        [questionList: Question.list()]
    }

    def answer = {
        def answer = Answer.get(params.int('id'))
        render answer.correct ? "Hurra, die Antwort ist richtig!" : "Die Antwort '$answer' ist leider falsch!"
    }
}
