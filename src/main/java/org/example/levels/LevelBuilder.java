package org.example.levels;

public class LevelBuilder {
    private Integer[][] levelMatrix;
    private int row;
    public LevelBuilder() {
        this.row = 0;
    }

    public void append(Integer[] levelRow) {
        Integer[][] newLevelMatrix = new Integer[this.row + 1][levelRow.length];

        if (this.levelMatrix != null) {
            LevelUtils.copyMatrix(this.levelMatrix, newLevelMatrix);
        }

        System.arraycopy(levelRow, 0, newLevelMatrix[this.row], 0, levelRow.length);

        this.levelMatrix = newLevelMatrix;
        row++;
    }

    public Level build() {
        return new Level(this.levelMatrix);
    }
}
