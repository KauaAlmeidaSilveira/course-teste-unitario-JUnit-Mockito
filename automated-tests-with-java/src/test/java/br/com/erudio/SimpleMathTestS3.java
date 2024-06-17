package br.com.erudio;

import br.com.erudio.math.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTestS3 {

    SimpleMath math;

    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach");
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach");
    }


    // test [System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        System.out.println("Running test sum");
        // Given - Arrange
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
        System.out.println("Running test subtraction");
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
        System.out.println("Running test multiplication");
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
        System.out.println("Running test division");
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
    //@Disabled("TODO: We need still work on it!")
    @Test
    @DisplayName("Test division by zero")
    void testDivision_When_FirstNumberIsDevidedByZero_ShouldThrowArithmeticException() {
        System.out.println("Running test divisionByZero");
        // Given
        Double firstNumber = 6.2;
        Double secondNumber = 0D;

        var expectedMessage = "Impossible to divide by zero !!";

        // Then
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
                    // When
                    math.division(firstNumber, secondNumber);
                },
                () -> "Division by zero should throw an ArithmeticException");

        assertEquals(expectedMessage, actual.getMessage(),
                () -> "Unexpected exception message");
    }

    @Test
    @DisplayName("Test (6.2 + 2)/2 = 4.1")
    void testMean() {
        System.out.println("Running test mean");
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
        System.out.println("Running test square root");
        Double number = 9D;

        Double result = math.squareRoot(number);

        Double expectedValue = 3D;

        assertEquals(expectedValue, result,
                () -> "Square root of the " + number + " must be " + expectedValue);
        assertNotEquals(9.2, result, "The result of Square root of the 9 don't must be 9.2");
        assertNotNull(result, "The result can't be null");
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Display name")
    @Test
    void testABCD_When_XYZ_Should() {
        System.out.println("Running test ABCD");
        // Given - Arrange
        // When - Act
        // Then - Assert
    }

}
