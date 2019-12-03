package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length]; //длина массиива = длина пришедвшему массиву
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        return mainDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] anotherDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            anotherDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return anotherDiagonal;
    }

    public int getMin(int[][] matrix) {
        int thirdMinValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (thirdMinValue > matrix[i][i]) {
                    thirdMinValue = matrix [j][i];
                }
            }
        }
        return thirdMinValue;
    }

    public int getMax(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }
}
