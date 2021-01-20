package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = (money - price);

        for (int i = 0, j = 0; i < coins.length; i++) {
            while (change >= coins[i]) {
                rsl[j] = coins[i];
                change -= rsl[j];
                j++;
                size++;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}