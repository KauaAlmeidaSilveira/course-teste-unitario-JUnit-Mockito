package br.com.erudio;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

class ArraysCompareTest {

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Test sorted array")
    @Test
    void testSort_When_ArrayNumber_ShouldSortedNumberArray() {
        // Given - Arrange
        int[] numbers = {25, 8, 21, 32, 3};
        int[] expected = {3, 8, 21, 25, 32};

        // When - Act
        Arrays.sort(numbers);

        // Then - Assert
        assertArrayEquals(numbers, expected);
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Test array performance")
    @Test
    //@Timeout(1)
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void testSortPerformance() {
        // Given - Arrange
        int[] numbers = {25, 8, 21, 32, 3};
        for (int i = 0; i < 100000; i++) {
            // When - Act
            numbers[0] = i;
            // Then - Assert
            Arrays.sort(numbers);
        }
    }

}
