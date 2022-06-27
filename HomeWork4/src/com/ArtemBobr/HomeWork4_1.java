/**
 * Из получемых чисел найти среднее произведение. Закончить выполнение,
 * когда следующим числом будет ноль.
 */
package com.ArtemBobr;

public class HomeWork4_1 {
    public static void main(String[] args) {
        double multiplication = 0;
        double multiply = 1;
        int n = 0;
        int x = (int)(Math.random() * 20);
        while(x != 0) {
            multiply *= x;
            n ++;
            x = (int)(Math.random()*20);
        }
        if(n != 0){
            multiplication = multiply / n;
        } else {
            multiplication = 0;
        }
        System.out.println("среднее произведение:" + multiplication);
    }
}
