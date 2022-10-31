package by.itstep.pashka.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task05Test {
    @Test
    public void findSumFivesMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        int expected = 12;
        int actual = Task05.findSumFivesMarks(array);
        assertArrayEquals(new int[]{expected}, new int[]{actual});
    }

    @Test
    public void findSumFoursMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        int expected = 6;
        int actual = Task05.findSumFoursMarks(array);
        assertArrayEquals(new int[]{expected}, new int[]{actual});
    }

    @Test
    public void findSumTriplesMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        int expected = 6;
        int actual = Task05.findSumTriplesMarks(array);
        assertArrayEquals(new int[]{expected}, new int[]{actual});
    }

    @Test
    public void findSumDeucesMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        int expected = 6;
        int actual = Task05.findSumTriplesMarks(array);
        assertArrayEquals(new int[]{expected}, new int[]{actual});
    }

    @Test
    public void findSumUnitsMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        int expected = 0;
        int actual = Task05.findSumUnitsMarks(array);
        assertArrayEquals(new int[]{expected}, new int[]{actual});
    }

    @Test
    public void findSumZerosMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        int expected = 0;
        int actual = Task05.findSumZerosMarks(array);
        assertArrayEquals(new int[]{expected}, new int[]{actual});
    }

    @Test
    public void findPercentFivesMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        double expected = 40.;
        double actual = Task05.findPercentFivesMarks(array);
        assertArrayEquals(new double[][]{new double[]{expected}}, new double[][]{new double[]{actual}});
    }

    @Test
    public void findPercentFoursMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        double expected = 20;
        double actual = Task05.findPercentFoursMarks(array);
        assertArrayEquals(new double[][]{new double[]{expected}}, new double[][]{new double[]{actual}});
    }

    @Test
    public void findPercentTriplesMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        double expected = 20;
        double actual = Task05.findPercentTriplesMarks(array);
        assertArrayEquals(new double[][]{new double[]{expected}}, new double[][]{new double[]{actual}});
    }

    @Test
    public void findPercentDeucesMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        double expected = 20;
        double actual = Task05.findPercentDeucesMarks(array);
        assertArrayEquals(new double[][]{new double[]{expected}}, new double[][]{new double[]{actual}});
    }

    @Test
    public void findPercentUnitsMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        double expected = 0;
        double actual = Task05.findPercentUnitsMarks(array);
        assertArrayEquals(new double[][]{new double[]{expected}}, new double[][]{new double[]{actual}});
    }

    @Test
    public void findPercentZerosMarks() {
        int[] array = {4, 5, 5, 3, 4, 5, 4, 5, 4, 5, 4, 5, 3, 4, 5,
                2, 3, 2, 3, 2, 3, 2, 5, 5, 3, 2, 2, 5, 5, 5};
        double expected = 0;
        double actual = Task05.findPercentZerosMarks(array);
        assertArrayEquals(new double[][]{new double[]{expected}}, new double[][]{new double[]{actual}});
    }

}
