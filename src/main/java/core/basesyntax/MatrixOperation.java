package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    protected int[] getDiagonal(int[][] matrix) {
        int minDemention = matrix.length < matrix[0].length ? matrix.length : matrix[0].length;
        int[] arrayMainDiagonal = new int[minDemention];
        for (int i = 0; i < minDemention; i++) {
            arrayMainDiagonal[i] = matrix[i][i];
        }
        return arrayMainDiagonal;
    }

    protected int getMin(int[][] matrix) {
        int minElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }
        return minElement;
    }

    protected int getMax(int[][] matrix) {
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }
}
