package com.kotenko.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void canAddTwoNumbers() {
        Calculator underTest = new Calculator();
        var number1 = 10;
        var number2 = 20;
        var result = underTest.add(number1, number2);
        assertEquals(30, result);
    }

    @Test
    void canHandleWhenInputIsZero() {
        Calculator underTest = new Calculator();
        var result = underTest.add(0);
        assertEquals(0, result);
    }

    @Test
    void canAddNumbersFromGivenArray() {
        Calculator underTest = new Calculator();
        var numbers = new int[]{1, 5, 3};
        var result = underTest.add(numbers);
        assertEquals(9, result);
    }
}
