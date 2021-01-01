package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6andK2ThenS2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }
}