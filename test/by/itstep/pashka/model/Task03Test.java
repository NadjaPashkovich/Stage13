package by.itstep.pashka.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task03Test {
    @Test
    public void checkElementEqual() {

        int[] array = {1, 1, 1, 1};

        boolean expected = true;

        boolean actual = Task03.checkElementEqual(array);

        assertArrayEquals(new boolean[]{expected}, new boolean[]{actual});
    }

    @Test
    public void checkElementDifferent() {

        int[] array = {1, 1, 1, 9};

        boolean expected = true;

        boolean actual = Task03.checkElementEqual(array);

        assertArrayEquals(new boolean[]{expected}, new boolean[]{actual});
    }
}
