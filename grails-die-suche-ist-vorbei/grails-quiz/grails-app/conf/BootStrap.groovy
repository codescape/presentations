import quiz.Question
import quiz.Answer

class BootStrap {
    def init = { servletContext ->
        environments {
            development {
                def quizData = new XmlSlurper().parse("quiz-data.xml")
                quizData.question.each { question ->
                    def q = new Question(text: question.@text.text()).save()
                    question.answer.each { answer ->
                        new Answer(question: q, text: answer.text(), correct: answer.@correct.text()).save()
                    }
                }
            }
        }
    }
}
