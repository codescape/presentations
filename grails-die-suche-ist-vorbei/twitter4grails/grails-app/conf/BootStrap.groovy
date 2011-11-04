import grails4taglib.Person
import grails4taglib.Status

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                // Fred is using twitter4grails:
                Person fred = new Person(username: 'Fred').save()
                new Status(poster: fred, message: 'Jabbadabbadooooooooooo!').save()

                // Wilma is using twitter4grails:
                Person wilma = new Person(username: 'Wilma').save()
                new Status(poster: wilma, message: 'Das ist mir alles zu modern!').save()
                new Status(poster: wilma, message: 'Ich mag das nicht!').save()
            }
        }
    }

    def destroy = {
    }

}
