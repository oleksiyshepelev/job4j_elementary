package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Petrov";
        names[1] = "Ivan Ivanov";
        names[2] = "Dmitriy Dmitriev";
        names[3] = "Vasiliy Vasiliev";

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
