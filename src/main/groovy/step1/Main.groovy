package step1

import static groovyx.javafx.GroovyFX.start

start {
    stage(title: 'Kreis im Quadrat', visible: true, centerOnScreen: true) {
        scene(stylesheets: 'css/main.css', width: 300, height: 300) {
            rectangle x: 25, y: 25, width: 250, height: 250, fill: '#990099'
            circle centerX: 150, centerY: 150, radius: 100, fill: LIGHTBLUE
        }
    }
}