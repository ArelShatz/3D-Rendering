package org.example.levels;

public class Level {
    private Integer[][] levelMatrix;

    public Level(Integer[][] levelMatrix) {
        this.levelMatrix = new Integer[levelMatrix.length][levelMatrix[0].length];
        LevelUtils.copyMatrix(levelMatrix, this.levelMatrix);
    }

    public Integer[][] levelMatrix() {
        return this.levelMatrix;
    }

    public void setLevelMatrix(Integer[][] levelMatrix) {
        this.levelMatrix = levelMatrix;
    }
}
