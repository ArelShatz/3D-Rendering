package org.example;

import org.example.debug.DebugUtils;
import org.example.levels.Level;
import org.example.levels.LevelLoader;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*JFrame screen = new JFrame();
        screen.setSize(400, 500);
        screen.setLayout(null);
        screen.setVisible(true);

        Display display = new Display();
        display.setBounds(0, 0, screen.getWidth(), screen.getHeight());

        screen.add(display);*/

        Level level = LevelLoader.load("level_1");

        DebugUtils.printMatrix(level.levelMatrix());
    }
}