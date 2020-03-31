package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiag = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            mainDiag[i] = matrix[i][i];
        }
        return mainDiag;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiag = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int y = 0; y < matrix.length; y++){
                counterDiag[i] = matrix[i][matrix.length-i-1];
            }

        }
        return counterDiag;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for (int y = 0; y < matrix[0].length; y++){
                if (matrix[i][y] < min){
                    min = matrix[i][y];
                    }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for(int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[0].length ; y++) {
                if (matrix[i][y] > max) {
                    max = matrix[i][y];
                }
            }
        }
        return max;
    }
}
