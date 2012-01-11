package samples

import groovyx.javafx.GroovyFX
import groovyx.javafx.SceneGraphBuilder

// inspired by the official samples

GroovyFX.start {
    def rand = new Random().&nextInt
    new SceneGraphBuilder().stage(title: 'Vanishing Circles', show: true) {
        scene(fill: black, width: 800, height: 600) {
            50.times {
                circle(centerX: rand(800), centerY: rand(600), radius: 100, stroke: white, strokeWidth: bind('hover', converter: { v -> v ? 5 : 0})) {
                    fill rgb(rand(255), rand(255), rand(255), 0.2)
                    effect boxBlur(width: 3, height: 3, iterations: 3)
                    onMouseClicked {  e ->
                        timeline {
                            at(3.s) { change e.source.radiusProperty() to 0 }
                        }.play()
                    }
                }
            }
        }
    }
}
