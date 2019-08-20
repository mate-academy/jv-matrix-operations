package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public static int[] getDiagonal(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int i;
        int j;
        for (i = 0, j = 0; i < matrix.length && j < matrix[i].length; i++, j++) {
            list.add(matrix[i][j]);
        }
        int[] result = new int[list.size()];
        for (i = 0; i < result.length; i++) {
            result[i] = list.get(i).intValue();
        }
        return result;
    }

    public static int getMin(int[][] matrix) {
        if (matrix.length == 0 || matrix == null) {
            return 0;
        }
        int minValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }

    public static int getMax(int[][] matrix) {
        if (matrix.length == 0 || matrix == null) {
            return 0;
        }
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }
}
