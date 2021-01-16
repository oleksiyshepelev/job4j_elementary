package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortWhit10Index() {
        int[] input = new int[] {3, 4, 1, 1, 5, 7, 10, 9, 8, 6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expect));
    }

    @Test
    public void whenHeve3Num() {
        int[] input = new int[] {3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenHeve2Num() {
        int[] input = new int[] {2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2};
        assertThat(result, is(expect));
    }
}