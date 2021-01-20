package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int vuelto = (money - price);
        if (vuelto > 0) {
            for (int i = 0, j = 0; i < coins.length; i++, size++) {
                while (vuelto - i > i) {
                    rsl[j] = coins[i];
                    vuelto -= rsl[j];
                    j++;
                    i++;
                }
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}