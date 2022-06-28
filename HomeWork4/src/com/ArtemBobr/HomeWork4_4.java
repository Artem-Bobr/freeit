package com.ArtemBobr;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class HomeWork4_4 {
    public static void main(String[] args) {
        int summ = 0;
        int n = 119;
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0){
               summ += i;
            }
        }
        System.out.println(summ);
    }
}
