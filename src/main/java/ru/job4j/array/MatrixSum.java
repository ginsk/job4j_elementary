package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int sell = 0; sell < array[row].length; sell++) {
                rsl = rsl + array[row][sell];
            }
        }
        return rsl;
    }
}


