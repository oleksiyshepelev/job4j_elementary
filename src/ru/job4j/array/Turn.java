package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int tempArr;
        int j = array.length - 1;
        for (int i = 0; i < j; i++, j--) {
            tempArr = array[i];
            array[i] = array[j];
            array[j] = tempArr;
        }
        return array;
    }
}
