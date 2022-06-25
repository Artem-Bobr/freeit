package com.ArtemBobr.HomeWork2;

/**
 * Написать программу, результатом работы которой будет вывод результата сравнения двух введенных чисел.
 */

public class HomeWork2_3 {
    public static void main(String[] args) {
        int a = 1223;
        int b = a % 100;

        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else
            System.out.println(a + " = " + b);
    }
}
