package samples

import groovyx.javafx.GroovyFX
import groovyx.javafx.SceneGraphBuilder

GroovyFX.start {
    new SceneGraphBuilder().stage(title: 'Vanishing Circle', show: true) {
        scene(fill: groovyblue, width: 400, height: 400) {
            circle(centerX: 200, centerY: 200, radius: 175) {
                fill greenyellow
                onMouseClicked { e ->
                    timeline {
                        at(3.s) {
                            change e.source.radiusProperty() to 0
                        }
                    }.play()
                }
            }
        }
    }
}
