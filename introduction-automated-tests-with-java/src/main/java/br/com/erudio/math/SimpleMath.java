package br.com.erudio.math;

public class SimpleMath {

    public Double sum(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    public Double subtraction(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }

    public Double multiplication(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    public Double division(Double firstNumber, Double secondNumber) {
        Double result = (firstNumber / secondNumber);
        if (result.isInfinite()) {
            throw new ArithmeticException("Impossible to divide by zero !!");
        }
        return result;
    }

    public Double mean(Double firstNumber, Double secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public Double squareRoot(Double number) {
        return Math.sqrt(number);
    }
}
