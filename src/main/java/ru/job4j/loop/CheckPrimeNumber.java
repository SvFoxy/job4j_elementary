package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 1; index <= number; index++) {
            if (number == 1) {
                prime = false;
                break;
            }
            if ((number % index) == 0 && index != 1 && index != number) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}