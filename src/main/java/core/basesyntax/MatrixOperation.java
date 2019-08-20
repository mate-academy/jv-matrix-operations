package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    protected int[] getDiagonal(int[][] matrix) {
        int diagonal[] = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    protected int getMin(int[][] matrix) {
        List<Integer> oneDMatrix = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                oneDMatrix.add(matrix[i][j]);
            }
        }
        int min = oneDMatrix.get(0);
        for (int i : oneDMatrix) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    protected int getMax(int[][] matrix) {
        List<Integer> oneDMatrix = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                oneDMatrix.add(matrix[i][j]);
            }
        }
        int max = oneDMatrix.get(0);
        for (int i : oneDMatrix) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
