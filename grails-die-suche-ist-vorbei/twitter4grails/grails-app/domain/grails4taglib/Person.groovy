package grails4taglib

class Person {

    String username

    static hasMany = [statuses: Status]

    static constraints = {
        username(unique: true)
    }

    String toString() {
        username
    }

}
