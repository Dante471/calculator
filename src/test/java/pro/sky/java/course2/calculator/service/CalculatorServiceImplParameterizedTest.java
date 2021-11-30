package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectAdditionResult(int num1, int num2) {
        int result = out.addition(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectSubtractionResult(int num1, int num2) {
        int result = out.subtraction(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectMultiplicationResult(int num1, int num2) {
        int result = out.multiplication(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectDivisionResult(int num1, int num2) {
        double result = out.division(num1, num2);
        assertEquals((double)num1 / num2, result);
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(TEST_NUM1, TEST_NUM1),
                Arguments.of(TEST_NUM2, TEST_NUM2),
                Arguments.of(TEST_NUM3, TEST_NUM3)
        );
    }
}
