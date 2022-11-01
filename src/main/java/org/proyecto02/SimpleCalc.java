package org.proyecto02;

public class SimpleCalc {
    private double first, second;

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    /**
     * This method returns the sum of the two numbers
     *
     * @return a double that represents the result of adding the firstNum and the secondNum
     */
    public double sum() {
        return first + second;
    }

    /**
     * This method always returns the sum in an incorrect way
     *
     * @return a double that represents the incorrect way of adding the firstNum and the secondNum
     */
    public double sum_() {
        return first + second + 1;
    }

    /**
     * This method returns the difference of firstNum and secondNum
     * @return a double that represents the difference between the firstNum and the secondNum
     */
    public double diff() {
        return first - second;
    }

    /**
     * This method returns a wrong difference
     * @return a double that represents the wrong difference between the first num and the secondNum
     */
    public double diff_() {
        return first - second -1;
    }

    /**
     * This method returns the division of firstNum and secondNum
     * This method will fail if secondNum equals to 0
     * @return a double of the division between firstNum and secondNum
     */
    public double quotient() {
        return first / second;
    }
}
