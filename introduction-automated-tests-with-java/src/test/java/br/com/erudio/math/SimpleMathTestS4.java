package br.com.erudio.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTestS4 {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    @ValueSource(strings = {"Kaua", "Nary", "Gleice"})
    @ParameterizedTest
    void testValueSource(String firstName) {
        System.out.println(firstName);
        assertNotNull(firstName);
    }

    @DisplayName("Test double division [firstNumber, secondNumber, expectedValue]")
    @ParameterizedTest
//    @MethodSource("testDivisionInputParameters")
//    @MethodSource
//    @CsvSource({
//            "6.2, 2.0, 3.1",
//            "71.0, 14.0, 5.07",
//            "18.3, 3.1, 5.9"
//    })
    @CsvFileSource(resources = "/testDivision.csv")
    void testDivision(double firstNumber, double secondNumber, double expectedValue) {
        System.out.printf("%.2f/%.2f = %.2f !%n", firstNumber, secondNumber, expectedValue);

        double result = math.division(firstNumber, secondNumber);

        assertEquals(expectedValue, result, 2D,
                () -> firstNumber + " / " + secondNumber + " must be " + expectedValue);
        assertNotEquals(9.2, result, "The result of the divison 6.2 / 2 don't must be 9.2");
    }

    //    public static Stream<Arguments> testDivisionInputParameters() {
//    public static Stream<Arguments> testDivision() {
//        return Stream.of(
//                Arguments.of(6.2, 2.0, 3.1),
//                Arguments.of(71.0, 14.0, 5.07),
//                Arguments.of(18.3, 3.1, 5.9)
//        );
//    }
}
