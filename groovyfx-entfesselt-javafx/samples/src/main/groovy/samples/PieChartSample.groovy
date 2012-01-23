package samples

import groovyx.javafx.GroovyFX
import groovyx.javafx.SceneGraphBuilder

def groovyFx = [cool: 12, hip: 34, fancy: 22, groovy: 44]

GroovyFX.start {
    def sgb = new SceneGraphBuilder()
    sgb.stage(title: 'GroovyFX is...', visible: true) {
        scene {
            pieChart(data: groovyFx)
        }
    }
}

