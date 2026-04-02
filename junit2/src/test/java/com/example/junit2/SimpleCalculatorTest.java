package com.example.junit2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator")
public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @BeforeEach
    public void activateCalculator() {
        calculator = new SimpleCalculator();
    }

    @AfterEach
    public void shutdown() {
        calculator = null;
    }

    @Test
    @Tag("Add")
    public void additionTest() {
        assertEquals(49, calculator.addition(42, 7));
    }

    @Test
     @Tag("Divide")
    public void divideTest() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(4, 0);
        });
    }

    @Test
     @Tag("Multiply")
    public void multiplyTest() {
        assertEquals(1225, calculator.multiply(35, 35));
    }

    @Test
     @Tag("Prime Check")
    public void primeTest() {
        assertEquals(true, calculator.isPrime(37));
    }

    @Test
     @Tag("Factorial")
    public void factorialTest() {
        assertEquals(5040, calculator.factorial(7));
    }

    
}
