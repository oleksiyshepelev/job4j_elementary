package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inRuToEu = 140;
        int inRuToDol = 120;
        int expectedEu = 2;
        int expectedDol = 2;
        int outEu = Converter.rubleToEuro(inRuToEu);
        int outDol = Converter.rubleToDollar(inRuToDol);
        boolean passedEu = expectedEu == outEu;
        boolean passedDol = expectedDol == outDol;

        System.out.println("140 rubles are 2 euros. Test result : " + passedEu);
        System.out.println("120 rubles are 2 dollars. Test result : " + passedDol);
    }
}
