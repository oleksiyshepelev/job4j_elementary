package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        double percentRest = percent / 100;
        double toPay = amount;
        int year = 0;
        while (toPay > 0) {
            toPay = (toPay * percentRest + toPay) - salary;
            year++;
        }
        return year;
    }
}