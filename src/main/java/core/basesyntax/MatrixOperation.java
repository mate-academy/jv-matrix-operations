package core.basesyntax;

import java.util.Arrays;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {

    public static int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = (matrix[i][i]);
        }
        return diagonal;
    }

    public static int[] getCounterDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = matrix.length - 1; i > -1; i--) {
            diagonal[(matrix.length - 1) - i] = (matrix[matrix.length - 1 - i][i]);
        }
        return diagonal;
    }

    public int getMin(int[][] matrix) {
        int min = Arrays.stream(matrix[0]).min().getAsInt();
        int tmp;
        for (int i = 1; i < matrix.length; i++) {
            tmp = Arrays.stream(matrix[i]).min().getAsInt();
            min = Math.min(min, tmp);
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = Arrays.stream(matrix[0]).max().getAsInt();
        int tmp;
        for (int i = 1; i < matrix.length; i++) {
            tmp = Arrays.stream(matrix[i]).max().getAsInt();
            max = Math.max(max, tmp);
        }
        return max;
    }
}
