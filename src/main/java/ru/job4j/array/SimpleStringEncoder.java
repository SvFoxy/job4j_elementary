package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != symbol) {
                result = result + symbol;
                if (counter > 1) {
                    result = result + counter;
                }
                counter = 1;
                symbol = input.charAt(i);
            } else {
               counter++;
            }
            if (i == input.length() - 1) {
                result = result + symbol;
                if (counter > 1) {
                    result = result + counter;
                }
            }
        }
        return result;
    }
}