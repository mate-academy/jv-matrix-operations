package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] numsmat = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            numsmat[i] = matrix[i][i];
        }
        return numsmat;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            min = (min > matrix[i][i]) ? matrix[i][i] : min;
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            max = (max < matrix[i][i]) ? matrix[i][i] : max;
        }
        return max;
    }
}
