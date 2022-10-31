package by.itstep.pashka.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task02Test {
    @Test
    public void checkPalindromeElementsOfArray() {
        int[] array = {1, 2, 3, 2, 1};

        boolean expected = true;

        boolean actual = Task02.checkPalindromeElementsOfArray(array);

        assertArrayEquals(new boolean[]{expected}, new boolean[]{actual});

    }
}
