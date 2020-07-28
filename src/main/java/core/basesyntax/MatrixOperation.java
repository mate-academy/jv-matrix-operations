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
        int[] counterDiagonal = new int[matrix.length];
        int depthIndex = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][depthIndex];
            depthIndex--;
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int minimal = matrix[0][0];
        for (int[] innerMatrix: matrix) {
            for (int element:innerMatrix) {
                if (element < minimal) {
                    minimal = element;
                }
            }
        }
        return minimal;
    }

    public int getMax(int[][] matrix) {
        int maximal = matrix[0][0];
        for (int[] innerMatrix: matrix) {
            for (int element:innerMatrix) {
                if (element > maximal) {
                    maximal = element;
                }
            }
        }
        return maximal;
    }

}
