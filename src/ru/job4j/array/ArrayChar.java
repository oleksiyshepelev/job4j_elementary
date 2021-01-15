package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = pref.length - 1; i > 0;) {
            for (int j = i; j > 0; j--, i--) {
                if (pref[i] != word[j]) {
                    return false;
                }
            }
        }
        return result;
    }
}