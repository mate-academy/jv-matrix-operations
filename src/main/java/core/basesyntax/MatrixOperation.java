package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної діагоналі прямокутної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int [] getDiagonal(int [] [] matrix) {
        int [] numb  = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            numb [i] = matrix [i] [i];
        }
        return numb;
    }

    public int getMin(int [][] matrix) {
        int min = matrix [0] [0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                min = matrix [i] [j] < min ? matrix [i] [j] : min;
            }
        }
        return min;
    }

    public int getMax(int [][] matrix) {
        int max = matrix [0] [0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = matrix [i] [j] > max ? matrix [i] [j] : max;
            }
        }
        return max;
    }
}
