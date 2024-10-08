package com.houarizegai.calculator;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private CalculatorUI calculatorUI;

    @Test
    public void testAddition() {
        calculatorUI = new CalculatorUI();
        assertEquals(3, calculatorUI.calculate(1,2,'+'));
        assertEquals(-3, calculatorUI.calculate(-2, -1, '+'));
        assertEquals(0, calculatorUI.calculate(-2, 2, '+'));
        assertEquals(2, calculatorUI.calculate(3, -1, '+'));
        assertEquals(-2, calculatorUI.calculate(-3, 1, '+'));
        assertEquals(1.1, calculatorUI.calculate(2.2, -1.1, '+'));
        assertEquals(-1.1, calculatorUI.calculate(-2.2, 1.1, '+'));
        assertEquals(0, calculatorUI.calculate(1.1, -1.1, '+'));
        assertEquals(0, calculatorUI.calculate(1, -1/2, '+'));
    }

    @Test
    public void testPower() {
        calculatorUI = new CalculatorUI();
        assertEquals(9, calculatorUI.calculate(3,2,'^'));
        assertEquals(0.25, calculatorUI.calculate(2, -2, '^'));
        assertEquals(4, calculatorUI.calculate(-2,2,'^'));
    }

}
