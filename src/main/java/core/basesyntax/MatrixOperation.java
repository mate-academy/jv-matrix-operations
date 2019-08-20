package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int size1 = matrix.length;
        int size2 = matrix[size1 - 1].length;
        int size = (size1 > size2) ? size2 : size1;

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = matrix[i][i];
        }

        return result;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];

        for (int[] i : matrix) {
            for (int j : i) {
                if (j < min) {
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
                if (j > max) {
                    max = j;
                }
            }
        }

        return max;
    }
}
