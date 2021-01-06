package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second && second < third) {
            result = third;
        } else if (first < second && second > third) {
            result = second;
        }
        return result;
    }
}