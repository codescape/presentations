package samples

import groovyx.javafx.beans.FXBindable
import groovyx.javafx.GroovyFX
import groovyx.javafx.SceneGraphBuilder
import groovy.transform.Canonical

@Canonical
class Person {
    @FXBindable String firstName = 'Max'
    @FXBindable String lastName = 'Mustermann'
}

def person = new Person('Stefan', 'Glase')

GroovyFX.start {
    new SceneGraphBuilder().stage(title: 'Properties Binding', show: true) {
        scene(width: 300) {
            vbox {
                tilePane {
                    label(text: 'FirstName')
                    textField(text: bind(person.firstNameProperty()))
                }
                tilePane {
                    label(text: 'LastName')
                    textField(text: bind(person.lastNameProperty()))
                }
            }
        }
    }
}
