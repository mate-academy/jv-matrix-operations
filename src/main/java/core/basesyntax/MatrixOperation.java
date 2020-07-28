package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] arrayDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arrayDiagonal[i] = matrix[i][i];
        }
        return arrayDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int lineCounter = matrix.length - 1;
        int[] arrayCounterDiagonal = new int [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arrayCounterDiagonal[i] = matrix[i][lineCounter];
            lineCounter--;
        }
        return arrayCounterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                min = matrix[i][j] < min ? matrix[i][j] : min;
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = matrix[i][j] > max ? matrix[i][j] : max;
            }
        }
        return max;
    }
}
