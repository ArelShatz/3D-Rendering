package org.example.components;

import org.example.levels.LevelLoader;

import java.awt.*;

public class Display extends Canvas {
    public Display() {
    }

    public void paint(Graphics graph) {
        setBackground(Color.BLACK);
        graph.setColor(Color.RED);
        graph.drawLine(0, 0, 100, 100);
    }
}
