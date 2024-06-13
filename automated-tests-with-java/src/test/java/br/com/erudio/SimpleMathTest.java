package br.com.erudio;

import br.com.erudio.math.SimpleMath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

    // test [System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        // Given - Arrange
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2;
        Double secondNumber = 2.0;
        Double expectedValue = 8.2;

        // When - Act
        Double result = math.sum(firstNumber, secondNumber);

        // Then - Assert
        assertEquals(expectedValue, result,
                () -> firstNumber + " + " + secondNumber + " must be " + expectedValue);
        assertNotEquals(9.2, result, "The result of 6.2 + 2 don't must be 9.2");
        assertNotNull(result, "The result can't be null");
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubstraction() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2;
        Double secondNumber = 2.0;

        Double result = math.subtraction(firstNumber, secondNumber);

        Double expectedValue = 4.2;

        assertEquals(expectedValue, result,
                () -> firstNumber + " - " + secondNumber + " must be " + expectedValue);
        assertNotEquals(9.2, result, "The result of 6.2 - 2 don't must be 9.2");
        assertNotNull(result, "The result can't be null");
    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2;
        Double secondNumber = 2.0;

        Double result = math.multiplication(firstNumber, secondNumber);

        Double expectedValue = 12.4;

        assertEquals(expectedValue, result,
                () -> firstNumber + " * " + secondNumber + " must be " + expectedValue);
        assertNotEquals(9.2, result, "The result of multiplication 6.2 * 2 don't must be 9.2");
        assertNotNull(result, "The result can't be null");
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2;
        Double secondNumber = 2.0;

        Double result = math.division(firstNumber, secondNumber);

        Double expectedValue = 3.1;

        assertEquals(expectedValue, result,
                () -> firstNumber + " / " + secondNumber + " must be " + expectedValue);
        assertNotEquals(9.2, result, "The result of the divison 6.2 / 2 don't must be 9.2");
        assertNotNull(result, "The result can't be null");
    }

    // test [System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test division by zero")
    void testDivision_When_FirstNumberIsDevidedByZero_ShouldThrowArithmeticException() {
        fail();
    }

    @Test
    @DisplayName("Test (6.2 + 2)/2 = 4.1")
    void testMean() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2;
        Double secondNumber = 2.0;

        Double result = math.mean(firstNumber, secondNumber);

        Double expectedValue = 4.1;

        assertEquals(expectedValue, result,
                () -> "The average between " + firstNumber + " and " + secondNumber + " must be " + expectedValue);
        assertNotEquals(9.2, result, "The average between 6.2 e 2 don't must be 9.2");
        assertNotNull(result, "The result can't be null");
    }

    @Test
    @DisplayName("Test square root of 9 = 3")
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        Double number = 9D;

        Double result = math.squareRoot(number);

        Double expectedValue = 3D;

        assertEquals(expectedValue, result,
                () -> "Square root of the " + number + " must be " + expectedValue);
        assertNotEquals(9.2, result, "The result of Square root of the 9 don't must be 9.2");
        assertNotNull(result, "The result can't be null");
    }


}
