package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {

        int i = 0;
        int j = 1;
        int[] newArray = {};
        while (i < array.length) {
            if (array[i] + array[j] == target) {
                newArray = new int[2];
                newArray[0] = i;
                newArray[1] = j;
                break;
            }
            if (j == array.length - 1) {
                j = i;
                i++;
            }
            j++;
        }
        return newArray;
    }
}