package com.ArtemBobr.HomeWork2;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 */
public class HomeWork2_2 {
    public static void main(String[] args) {
        int n = 4711;
        int m = n % 10;
        int u = (n / 10) % 10;
        int x = (n / 100) % 10;
        int z = (n / 1000) % 10;
        System.out.print(m);
        System.out.print(u);
        System.out.print(x);
        System.out.print(z);
    }
}
