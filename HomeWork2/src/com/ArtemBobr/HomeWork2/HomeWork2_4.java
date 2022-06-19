package com.ArtemBobr.HomeWork2;

/**
 * Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
 */
public class HomeWork2_4 {
    public static void main(String[] args) {
        int a = 4712;
        int m = a % 10;
        int u = (a / 10) % 10;
        int x = (a / 100) % 10;
        int z = (a / 1000) % 10;
        boolean t = m != u && m != x && m != z && u != x && u != z && x != z;
        boolean f = false;
        if(t){
            System.out.println(t);
        }
        else{
            System.out.println(f);
        }
    }
}
