package ru.job4j.condition;

public class ScArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = ScArea.square(6, 2);
        System.out.println("p = 6, k = 2, real = " + result1);
    }
 }
