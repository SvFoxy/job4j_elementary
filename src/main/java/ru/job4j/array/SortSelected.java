package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i + 1, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i + 1, data.length - 1);
            if (data[i] > min) {
                SwitchArray.swap(data, i, index);
            }
        }
        return data;
    }
}