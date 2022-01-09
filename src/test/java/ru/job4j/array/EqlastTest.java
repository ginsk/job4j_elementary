package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EqlastTest {

    @Test
    public void check() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = Eqlast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = Eqlast.check(left, right);
        Assert.assertFalse(result);
    }
}