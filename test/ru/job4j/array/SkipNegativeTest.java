package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skipIfrow0AndCell1AreNegativ() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void skipIfrow2AndCell3AreNegativ() {
        int[][] in = {
                {1, 0},
                {1, 2},
                {1, -2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2},
                {1, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}