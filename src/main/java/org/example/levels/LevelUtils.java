package org.example.levels;

import org.example.utils.Dimension;
import org.example.utils.Point;

public class LevelUtils {
    public static void copyMatrix(
            Integer[][] sourceMatrix,
            Dimension sourceDimension,
            Integer[][] destinationMatrix,
            Point destinationCoordinates
    ) {
        for (int row = sourceDimension.y();
             row < sourceDimension.y() + sourceDimension.height();
             row++
        ) {
            System.arraycopy(
                    sourceMatrix[row],
                    sourceDimension.x(),
                    destinationMatrix[row + destinationCoordinates.y()],
                    destinationCoordinates.x(),
                    sourceDimension.width()
            );
        }
    }

    public static void copyMatrix(Integer[][] sourceMatrix, Integer[][] destinationMatrix) {
        int sourceWidth = sourceMatrix[0].length;
        int sourceHeight = sourceMatrix.length;

        int destinationWidth = destinationMatrix[0].length;

        if (sourceWidth != destinationWidth) {
            return;
        }

        LevelUtils.copyMatrix(
                sourceMatrix,
                new Dimension(0, 0, sourceWidth, sourceHeight),
                destinationMatrix,
                new Point(0, 0)
        );
    }

    public static Integer[] castStringArrayToInt(String[] array) throws NumberFormatException {
        Integer[] castArray = new Integer[array.length];

        for (int index = 0; index < array.length; index++) {
            castArray[index] = Integer.parseInt(array[index]);
        }

        return castArray;
    }
}
