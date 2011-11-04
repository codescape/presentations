package grails4taglib

class Status {

    String message
    Date dateCreated

    static belongsTo = [poster: Person]

    static constraints = {
        message(blank: false, maxSize: 140)
    }

}
