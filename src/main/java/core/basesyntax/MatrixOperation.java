package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int [] diagonal = new int[matrix[0].length];
        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int [] counterDiagonal = new int[matrix[0].length];
        for (int i = 0; i < counterDiagonal.length; i++) {
            counterDiagonal[i] = matrix[i][(counterDiagonal.length - 1) - i];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int [] i : matrix) {
            for (int j : i) {
                min = (j < min) ? j : min;
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int [] i : matrix) {
            for (int j : i) {
                max = (j > max) ? j : max;
            }
        }
        return max;
    }
}
