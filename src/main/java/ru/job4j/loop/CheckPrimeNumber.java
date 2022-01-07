package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
             boolean prime = false;
             return prime;
             break;
            }
        }
        boolean prime = true;
        return prime;
    }
}
