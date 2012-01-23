package samples

import groovyx.javafx.GroovyFX
import groovyx.javafx.SceneGraphBuilder

GroovyFX.start {
    def sgb = new SceneGraphBuilder()
    sgb.stage(title: 'Move!', width: 400, height: 400, visible: true) {
        scene(fill: greenyellow) {
            redCircle = sgb.circle(radius: 25) {
                fill red
            }
        }
        timeline(cycleCount: indefinite, autoReverse: true) {
            at(800.ms) {
                change(redCircle, 'layoutX') to 200 tween easeboth
                change(redCircle, 'layoutY') to 200 tween easeboth
                change(redCircle, 'scaleX') to 4
                change(redCircle, 'scaleY') to 4
            }
        }.play()
    }
}
