package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MatrixOperationTest {
    private static final int[][] FIRST_TEST_MATRIX = {
            {2, 31, 6, 7},
            {15, 42, 1, 0},
            {9, 7, 12, 19},
            {55, 34, 1, 10}
    };
    private static final int[][] SECOND_TEST_MATRIX = {
            {-2, 281, 0},
            {-15, 0, 1},
            {3, 7, -12},
    };
    private static final int[][] THIRD_TEST_MATRIX = {
            {-5}
    };

    private static final int[] FIRST_EXPECTED_DIAGONAL = {2, 42, 12, 10};
    private static final int[] SECOND_EXPECTED_DIAGONAL = {-2, 0, -12};
    private static final int[] THIRD_EXPECTED_DIAGONAL = {-5};

    @Test
    public void getDiagonal() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int[] firstActualResult = matrixOperation.getDiagonal(FIRST_TEST_MATRIX);
        int[] secondActualResult = matrixOperation.getDiagonal(SECOND_TEST_MATRIX);
        int[] thirdActualResult = matrixOperation.getDiagonal(THIRD_TEST_MATRIX);
        Assert.assertArrayEquals("Test failed with result = "
                + Arrays.toString(firstActualResult), firstActualResult, FIRST_EXPECTED_DIAGONAL);
        Assert.assertArrayEquals("Test failed with result = "
                + Arrays.toString(secondActualResult), secondActualResult, SECOND_EXPECTED_DIAGONAL);
        Assert.assertArrayEquals("Test failed with result = "
                + Arrays.toString(thirdActualResult), thirdActualResult, THIRD_EXPECTED_DIAGONAL);
    }

    @Test
    public void getMin() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int firstActualResult = matrixOperation.getMin(FIRST_TEST_MATRIX);
        int firstExpectedResult = Arrays.stream(FIRST_TEST_MATRIX)
                .flatMapToInt(Arrays::stream).min().getAsInt();
        int secondActualResult = matrixOperation.getMin(SECOND_TEST_MATRIX);
        int secondExpectedResult = Arrays.stream(SECOND_TEST_MATRIX)
                .flatMapToInt(Arrays::stream).min().getAsInt();
        int thirdActualResult = matrixOperation.getMin(THIRD_TEST_MATRIX);
        int thirdExpectedResult = Arrays.stream(THIRD_TEST_MATRIX)
                .flatMapToInt(Arrays::stream).min().getAsInt();
        Assert.assertEquals("Test failed with min result = "
                + firstActualResult, firstActualResult, firstExpectedResult);
        Assert.assertEquals("Test failed with min result = "
                + secondActualResult, secondActualResult, secondExpectedResult);
        Assert.assertEquals("Test failed with min result = "
                + thirdActualResult, thirdActualResult, thirdExpectedResult);
    }

    @Test
    public void getMax() {
        MatrixOperation matrixOperation = new MatrixOperation();
        int firstActualResult = matrixOperation.getMax(FIRST_TEST_MATRIX);
        int firstExpectedResult = Arrays.stream(FIRST_TEST_MATRIX)
                .flatMapToInt(Arrays::stream).max().getAsInt();
        int secondActualResult = matrixOperation.getMax(SECOND_TEST_MATRIX);
        int secondExpectedResult = Arrays.stream(SECOND_TEST_MATRIX)
                .flatMapToInt(Arrays::stream).max().getAsInt();
        int thirdActualResult = matrixOperation.getMax(THIRD_TEST_MATRIX);
        int thirdExpectedResult = Arrays.stream(THIRD_TEST_MATRIX)
                .flatMapToInt(Arrays::stream).max().getAsInt();
        Assert.assertEquals("Test failed with max result = "
                + firstActualResult, firstActualResult, firstExpectedResult);
        Assert.assertEquals("Test failed with max result = "
                + secondActualResult, secondActualResult, secondExpectedResult);
        Assert.assertEquals("Test failed with max result = "
                + thirdActualResult, thirdActualResult, thirdExpectedResult);
    }
}
