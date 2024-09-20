package org.example.levels;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LevelLoader {

    public static Level load(String levelName) {
        String levelFilePath = LevelMapping.get(levelName);

        if (levelFilePath == null) {
            throw new RuntimeException("the level with the name " + levelName + " was not found");
        }

        LevelBuilder levelBuilder = new LevelBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(levelFilePath))) {
            String fileLine = br.readLine();

            while (fileLine != null) {
                String[] line = fileLine.split(" ");
                levelBuilder.append(LevelUtils.castStringArrayToInt(line));
                fileLine = br.readLine();
            }
        } catch (NumberFormatException exception) {
            System.out.println("level file contains characters that cannot be converted to numbers");
        } catch (IOException exception) {
            System.out.println("error when reading file " + levelFilePath);
        }

        return levelBuilder.build();
    }
}
