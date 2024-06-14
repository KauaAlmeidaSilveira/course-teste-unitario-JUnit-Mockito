package br.com.erudio;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArraysCompareTest {

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Display name")
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

}
