package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    protected int[] getDiagonal(int[][] matrix) {
        int dementionX = matrix.length;
        int dementionY = matrix[0].length;
        int minDemention = dementionX < dementionY ? dementionX : dementionY;
        int[] arrayMainDiagonal = new int[minDemention];
        for (int i = 0; i < minDemention; i++) {
            arrayMainDiagonal[i] = matrix[i][i];
        }
        return arrayMainDiagonal;
    }

    protected int getMin(int[][] matrix) {
        int minElement = matrix[0][0];
        int dementionX = matrix.length;
        int dementionY = matrix[0].length;
        for (int i = 0; i < dementionX; i++) {
            for (int j = 0; j < dementionY; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }
        return minElement;
    }

    protected int getMax(int[][] matrix) {
        int maxElement = matrix[0][0];
        int dementionX = matrix.length;
        int dementionY = matrix[0].length;
        for (int i = 0; i < dementionX; i++) {
            for (int j = 0; j < dementionY; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }
}
