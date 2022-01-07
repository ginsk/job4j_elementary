package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double z = amount + amount * percent - salary;
                 if (z > salary) {
                     z = z * percent - salary;
                     year++;
                 }
        return year;
    }
}
