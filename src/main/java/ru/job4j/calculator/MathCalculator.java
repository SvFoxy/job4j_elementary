package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOf2(double first, double second) {
        return subtr(first, second)
                + div(first, second);
    }

    public static double sumOf4(double first, double second) {
        return subtr(first, second)
                + div(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOf2(10, 20));
        System.out.println("Результат расчета равен: " + sumOf4(10, 20));
    }
}