package org.proyecto02;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalcTest {

    @CsvSource({
            "1,   1,   2",
            "1,   0,   1",
            "1,  -1,   0",
            "1,  -1.3, -0.30000000000000004",
            "-1,  1.3,  0.30000000000000004",
            "-5,  10,  5",
            "12.3,   12.4,  24.700000000000003"
    })
    @ParameterizedTest(name = "{0} + {1} = {2}")
    void sum(double firstNum, double secondNum, double expectedResult) {
        SimpleCalc simpleCalc = new SimpleCalc();
        simpleCalc.setFirst(firstNum);
        simpleCalc.setSecond(secondNum);
        assertEquals(expectedResult, simpleCalc.sum(),
                () -> firstNum + " + " + secondNum + " should be equals to " + expectedResult);
    }

    @CsvSource({
            "1,   1,   2",
            "1,   0,   1",
            "1,  -1,   0",
            "1,  -1.3, -0.30000000000000004",
            "-1,  1.3,  0.30000000000000004",
            "-5,  10,  5",
            "12.3,   12.4,  24.700000000000003"
    })
    @ParameterizedTest(name = "{0} + {1} = {2}")
    void sum_(double firstNum, double secondNum, double expectedResult) {
        SimpleCalc simpleCalc = new SimpleCalc();
        simpleCalc.setFirst(firstNum);
        simpleCalc.setSecond(secondNum);
        assertEquals(expectedResult, simpleCalc.sum_(),
                () -> firstNum + " + " + secondNum + " should be equals to " + expectedResult);
    }

    @CsvSource({
            "1,   1,   0",
            "1,   0,   1",
            "1,  -1,   2",
            "1,  -1.3, 2.3",
            "-1,  1.3,  -2.3",
            "-5,  10,  -15",
            "12.3,   12.4,  -0.09999999999999964"
    })
    @ParameterizedTest(name = "{0} - {1} = {2}")
    void diff(double firstNum, double secondNum, double expectedResult) {
        SimpleCalc simpleCalc = new SimpleCalc();
        simpleCalc.setFirst(firstNum);
        simpleCalc.setSecond(secondNum);
        assertEquals(expectedResult, simpleCalc.diff(),
                () -> firstNum + " - " + secondNum + " should be equals to " + expectedResult);
    }

    @CsvSource({
            "1,   1,   0",
            "1,   0,   1",
            "1,  -1,   2",
            "1,  -1.3, 2.3",
            "-1,  1.3,  -2.3",
            "-5,  10,  -15",
            "12.3,   12.4,  -0.09999999999999964"
    })
    @ParameterizedTest(name = "{0} - {1} = {2}")
    void diff_(double firstNum, double secondNum, double expectedResult) {
        SimpleCalc simpleCalc = new SimpleCalc();
        simpleCalc.setFirst(firstNum);
        simpleCalc.setSecond(secondNum);
        assertEquals(expectedResult, simpleCalc.diff_(),
                () -> firstNum + " - " + secondNum + " should be equals to " + expectedResult);
    }

    @CsvSource({
            "1,   1,   1",
            "1,   0,   Infinity",
            "1,  -1,   -1",
            "1,  -1.3, -0.7692307692307692",
            "-1,  1.3, -0.7692307692307692",
            "-5,  10,  -0.5",
            "12.3,   12.4,  0.9919354838709677"
    })
    @ParameterizedTest(name = "{0} / {1} = {2}")
    void quotient(double firstNum, double secondNum, double expectedResult) {
        SimpleCalc simpleCalc = new SimpleCalc();
        simpleCalc.setFirst(firstNum);
        simpleCalc.setSecond(secondNum);
        assertEquals(expectedResult, simpleCalc.quotient(),
                () -> firstNum + " / " + secondNum + " should be equals to " + expectedResult);
    }
}