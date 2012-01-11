package samples

import groovyx.javafx.SceneGraphBuilder
import groovyx.javafx.GroovyFX
import javafx.scene.text.Font
import javafx.scene.text.FontWeight

def myFont = Font.font('Verdana', FontWeight.BOLD, 50)

GroovyFX.start {
    new SceneGraphBuilder().stage(title: 'Hello World', width: 600, height: 280, visible: true) {
        scene(fill: white) {
            text(text: 'Hello World', x: 130, y: 130, font: myFont)
        }
    }
}
