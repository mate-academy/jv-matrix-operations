package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonalArray = new int[Math.min(matrix.length, matrix[0].length)];
        for (int i = 0; i < mainDiagonalArray.length; i++) {
            mainDiagonalArray[i] = matrix[i][i];
        }
        return mainDiagonalArray;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonalArray = new int[Math.min(matrix.length, matrix[0].length)];
        for (int i = 0; i < counterDiagonalArray.length; i++) {
            counterDiagonalArray[i] = matrix[i][counterDiagonalArray.length - i - 1];
        }

        return counterDiagonalArray;
    }

    public int getMin(int[][] matrix) {
        int lowest = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                lowest = lowest <= ints[j] ? lowest : ints[j];
            }
        }
        return lowest;
    }

    public int getMax(int[][] matrix) {
        int largest = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = largest >= ints[j] ? largest : ints[j];
            }
        }
        return largest;
    }
}
