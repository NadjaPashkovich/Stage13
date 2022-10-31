package by.itstep.pashka.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task04Test {
    @Test
    public void calcNumberOfEvenElements() {
        int[] array = {1, 2, 3};
        int expected = 1;
        int actual = Task04.calcNumberOfEvenElements(array);
        assertArrayEquals(new int[]{expected}, new int[]{actual});
    }

    @Test
    public void calcNumberOfOddElements() {
        int[] array = {1, 2, 3};
        int expected = 2;
        int actual = Task04.calcNumberOfOddElements(array);
        assertArrayEquals(new int[]{expected}, new int[]{actual});
    }
}
