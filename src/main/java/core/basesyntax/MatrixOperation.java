package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal[i] = matrix[i][i];
        }
        return mainDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] sideDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sideDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return sideDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] string : matrix) {
            for (int column : string) {
                if (min > column) {
                    min = column;
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] string : matrix) {
            for (int column : string) {
                if (min < column) {
                    min = column;
                }
            }
        }
        return min;
    }
}
