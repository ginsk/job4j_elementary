package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return rsl;
    }

    public static void main(String[] args) {
       double result = Point.distance(0, 0, 2, 0);
        System.out.println("resul (x1, y1) to (x2,y2)" + result);
    }
}
