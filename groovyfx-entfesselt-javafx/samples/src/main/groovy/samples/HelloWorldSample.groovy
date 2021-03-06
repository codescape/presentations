package samples

import groovyx.javafx.SceneGraphBuilder
import groovyx.javafx.GroovyFX
import javafx.scene.text.Font
import javafx.scene.text.FontWeight

def myFont = Font.font('Verdana', FontWeight.BOLD, 64)

GroovyFX.start {
    def sgb = new SceneGraphBuilder()
    sgb.stage(title: 'Hello OOP', width: 600, height: 280, visible: true) {
        scene(fill: white) {
            text(text: 'Hello OOP', x: 120, y: 140, font: myFont, fill: red)
        }
    }
}
