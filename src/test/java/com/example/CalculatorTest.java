package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void returnsTrueForEvenNumbers() {
        assertTrue(calculator.isEven(2));
    }

    @Test
    void returnsFalseForOddNumbers() {
        assertFalse(calculator.isEven(3));
    }
}
