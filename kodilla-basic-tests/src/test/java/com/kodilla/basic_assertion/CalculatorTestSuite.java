package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEqualsPower;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.Sum(a,b);
        assertEquals(13,sumResult);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.Sub(a,b);
        assertEquals(-3,subResult);
    }
    @Test
    public void testPower(){
        Calculator calculator = new Calculator();
        double a = 5;
        double b = -5;
        double powerResult = calculator.Power(a);
        assertEqualsPower(25.0,powerResult);
        double powerResultNeg = calculator.Power(b);
        assertEqualsPower(25.0,powerResultNeg);
    }
}
