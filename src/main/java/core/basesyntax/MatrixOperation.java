package core.basesyntax;

import java.util.Arrays;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] main_diagonal_array = new int [Math.min(matrix.length, matrix[0].length)];
        for (int i = 0; i < main_diagonal_array.length; i++) {
            main_diagonal_array[i] = matrix[i][i];
        }
        return main_diagonal_array;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counter_diagonal_array = new int [Math.min(matrix.length, matrix[0].length)];
        for (int i = 0; i < counter_diagonal_array.length; i++) {
            counter_diagonal_array[i] = matrix[i][counter_diagonal_array.length-i-1];
        }

        return counter_diagonal_array;
    }

    public int getMin(int[][] matrix) {
        int lowest = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                lowest = Math.min(lowest, ints[j]);
            }
        }
        return lowest;
    }

    public int getMax(int[][] matrix) {
        int largest = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(largest, ints[j]);
            }
        }
        return largest;
    }
}
