package smellicious

import spock.lang.Specification

class ListSpec extends Specification {
    
    void "An empty list tells me that it is empty"() {
        given:
        def list = new List()
        
        expect:
        list.isEmpty()
    }

}
