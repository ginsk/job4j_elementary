package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1To1To1Then2() {
        int left = 2;
        int right = 1;
        int first = 1;
        int result = Max.max(left, right, first);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1To2To3T03Then3() {
        int left = 3;
        int right = 1;
        int first = 2;
        int four = 3;
        int result = Max.max(left, right, four);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

}