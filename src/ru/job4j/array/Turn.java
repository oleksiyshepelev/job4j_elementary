package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int tempArr = 0;
        for (int i = 0; i < array.length / 2; i++) {
            tempArr = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tempArr;
        }
        return array;
    }
}
