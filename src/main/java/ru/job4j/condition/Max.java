package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
            }

    public static int max(int first, int right, int left) {
        return max(first, max(left, right));
    }

    public static int max(int first, int right, int left, int four) {
        return  max(four, max(first, right, left));
    }
    }


