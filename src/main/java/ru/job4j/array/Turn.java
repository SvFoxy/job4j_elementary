package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int source = 0;
        int dest = array.length - 1;
        for (int index = 0; index < array.length; index++) {
            if (array.length % 2 != 0 && source + index == dest - index) {
                break;
            }
            int temp = array[source + index];
            array[source + index] = array[dest - index];
            array[dest - index] = temp;
            if (array.length % 2 == 0 && source + index == dest - index - 1) {
                break;
            }
        }
        return array;
    }
}