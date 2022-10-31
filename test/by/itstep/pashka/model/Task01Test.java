package by.itstep.pashka.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task01Test {
    @Test
    public void testCheckSortAsc() {
        int[] array = {3, 4, 5};
        boolean expected = true;

        boolean actual = Task01.checkSortAsc(array);

        assertArrayEquals(new boolean[]{expected}, new boolean[]{actual});
    }


    @Test
    public void testCheckSortDesc() {
        int[] array = {5, 4, 3};
        boolean expected = true;

        boolean actual = Task01.checkSortDesc(array);

        assertArrayEquals(new boolean[]{expected}, new boolean[]{actual});
    }
}

