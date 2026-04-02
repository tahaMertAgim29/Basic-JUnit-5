package com.example.junit2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MathTest {

    private SimpleCalculator calculator;

    @BeforeEach
    public void activate() {
        calculator = new SimpleCalculator();
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,4,5,6,8,9,10,11})
    public void divisionTest(int div) {
        assertTrue(calculator.isDivided(90, div));
    }


    

}
