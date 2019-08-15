package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MatrixOperationTest {
    private static final int[][] TEST_MATRIX = {
            {-2, 31, 6, 7},
            {15, -42, 1, 0},
            {9, -7, 12, 19},
            {55, 34, 1, -10}
    };

    private static final int[][] SINGLE_ELEMENT_MATRIX = {
            {-5}
    };

    private static final int[] MATRIX_EXPECTED_DIAGONAL = {-2, -42, 12, -10};
    private static final int[] SINGLE_ELEMENT_EXPECTED_DIAGONAL = {-5};

    @Test
    public void getMatrixDiagonal() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int[] actualResult = matrixOperation.getDiagonal(TEST_MATRIX);
        Assert.assertArrayEquals("Test failed with result = "
                + Arrays.toString(actualResult), actualResult, MATRIX_EXPECTED_DIAGONAL);
    }

    @Test
    public void getSingleElementMatrixDiagonal() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int[] actualResult = matrixOperation.getDiagonal(SINGLE_ELEMENT_MATRIX);
        Assert.assertArrayEquals("Test failed with result = "
                + Arrays.toString(actualResult), actualResult, SINGLE_ELEMENT_EXPECTED_DIAGONAL);
    }

    @Test
    public void getMatrixMin() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMin(TEST_MATRIX);
        int expectedResult = Arrays.stream(TEST_MATRIX)
                .flatMapToInt(Arrays::stream).min().getAsInt();
        Assert.assertEquals("Test failed with min result = "
                + actualResult, actualResult, expectedResult);
    }

    @Test
    public void getSingleElementMatrixMin() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMin(SINGLE_ELEMENT_MATRIX);
        int expectedResult = Arrays.stream(SINGLE_ELEMENT_MATRIX)
                .flatMapToInt(Arrays::stream).min().getAsInt();
        Assert.assertEquals("Test failed with min result = "
                + actualResult, actualResult, expectedResult);
    }

    @Test
    public void getMatrixMax() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMax(TEST_MATRIX);
        int expectedResult = Arrays.stream(TEST_MATRIX)
                .flatMapToInt(Arrays::stream).max().getAsInt();
        Assert.assertEquals("Test failed with max result = "
                + actualResult, actualResult, expectedResult);
    }

    @Test
    public void getSingleElementMatrixMax() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMax(SINGLE_ELEMENT_MATRIX);
        int expectedResult = Arrays.stream(SINGLE_ELEMENT_MATRIX)
                .flatMapToInt(Arrays::stream).max().getAsInt();
        Assert.assertEquals("Test failed with max result = "
                + actualResult, actualResult, expectedResult);
    }
}
