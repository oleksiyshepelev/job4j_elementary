package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when6() {
        boolean rsl = CheckPrimeNumber.check(6);
        assertThat(rsl, is(false));
    }

    @Test
    public void when25() {
        boolean rsl = CheckPrimeNumber.check(25);
        assertThat(rsl, is(false));
    }

    @Test
    public void when71() {
        boolean rsl = CheckPrimeNumber.check(71);
        assertThat(rsl, is(true));
    }
}