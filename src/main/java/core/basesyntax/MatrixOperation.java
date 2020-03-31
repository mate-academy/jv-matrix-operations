package core.basesyntax;

//import java.util.Arrays;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        //matrix = new int [matrix.length][matrix.length];
        int[] diagonalElts = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonalElts[i] = matrix[i][i];
        }
        return diagonalElts;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] countDiagElts = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            countDiagElts[i] = matrix[i][matrix.length - (i + 1)];
        }
        //System.out.println(Arrays.toString(countDiagElts));
        return countDiagElts;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix [i][j] < min) {
                    min = matrix[i][j];
                }
            }

        }
        //System.out.println(min);
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
