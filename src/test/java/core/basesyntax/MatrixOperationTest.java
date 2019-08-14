package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MatrixOperationTest {
    private static final int[][] TEST_MATRIX = {
            {2, 31, 6, 7},
            {15, 42, 1, 0},
            {9, 7, 12, 19},
            {55, 34, 1, 10}
    };
    private static final int[] EXPECTED_DIAGONAL = {2, 42, 12, 10};

    @Test
    public void getDiagonal() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int[] actualResult = matrixOperation.getDiagonal(TEST_MATRIX);
        Assert.assertArrayEquals("Test failed with result = "
                + Arrays.toString(actualResult), actualResult, EXPECTED_DIAGONAL);
    }

    @Test
    public void getMin() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMin(TEST_MATRIX);
        int expectedResult = Arrays.stream(TEST_MATRIX)
                .flatMapToInt(Arrays::stream).min().getAsInt();
        Assert.assertEquals("Test failed with min result = "
                + actualResult, actualResult, expectedResult);
    }

    @Test
    public void getMax() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int actualResult = matrixOperation.getMax(TEST_MATRIX);
        int expectedResult = Arrays.stream(TEST_MATRIX)
                .flatMapToInt(Arrays::stream).max().getAsInt();
        Assert.assertEquals("Test failed with max result = "
                + actualResult, actualResult, expectedResult);
    }
}
