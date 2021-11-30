package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectAdditionResult() {
        int result1 = out.addition(TEST_NUM1, TEST_NUM1);
        assertEquals(TEST_NUM1 + TEST_NUM1, result1);
        int result2 = out.addition(TEST_NUM2, TEST_NUM2);
        assertEquals(TEST_NUM2 + TEST_NUM2, result2);
    }

    @Test
    public void shouldReturnCorrectSubtractionResult() {
        int result1 = out.subtraction(TEST_NUM1, TEST_NUM1);
        assertEquals(TEST_NUM1 - TEST_NUM1, result1);
        int result2 = out.subtraction(TEST_NUM2, TEST_NUM2);
        assertEquals(TEST_NUM2 - TEST_NUM2, result2);
    }

    @Test
    public void shouldReturnCorrectMultiplicationResult() {
        int result1 = out.multiplication(TEST_NUM1, TEST_NUM1);
        assertEquals(TEST_NUM1 * TEST_NUM1, result1);
        int result2 = out.multiplication(TEST_NUM2, TEST_NUM2);
        assertEquals(TEST_NUM2 * TEST_NUM2, result2);
    }

    @Test
    public void shouldReturnCorrectDivisionResult() {
        double result1 = out.division(TEST_NUM1, TEST_NUM1);
        assertEquals((double)TEST_NUM1 / TEST_NUM1, result1);
        double result2 = out.division(TEST_NUM2, TEST_NUM2);
        assertEquals((double)TEST_NUM2 / TEST_NUM2, result2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivisorIsZero() {
        assertThrows(IllegalArgumentException.class,
                () -> out.division(TEST_NUM1, ZERO)
        );
    }
}
