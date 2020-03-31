package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int [] arrayDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arrayDiagonal[i] = matrix[i][i];
        }
        return arrayDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int [] arrayCounterDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arrayCounterDiagonal[i] = matrix[i][(matrix.length - (i + 1))];
        }
        return arrayCounterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] i : matrix) {
            for (int j : i) {
                if (min > j) {
                    min = j;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] i : matrix) {
            for (int j : i) {
                if (max < j) {
                    max = j;
                }
            }
        }
        return max;
    }
}
