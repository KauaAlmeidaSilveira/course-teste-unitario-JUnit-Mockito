package br.com.erudio.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DemoRepeatedTest {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    // test [System Under Test]_[Condition or State Change]_[Expected Result]
    //@Disabled("TODO: We need still work on it!")
    @RepeatedTest(value = 3, name = "{displayName}. Repetition {currentRepetition} of {totalRepetitions}")
    @DisplayName("Test division by zero")
    void testDivision_When_FirstNumberIsDevidedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo,
            TestInfo testInfo
    ) {
        System.out.println("Repetition Nº " + repetitionInfo.getCurrentRepetition() +
                " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running " + testInfo.getTestMethod().get().getName());
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

}
