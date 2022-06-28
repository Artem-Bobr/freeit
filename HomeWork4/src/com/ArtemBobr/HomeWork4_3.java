package com.ArtemBobr;

import java.util.Scanner;

/**
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class HomeWork4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        boolean isSimple = true;
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                isSimple = false;
                break;
            }
        }
        if(isSimple){
            System.out.println(number + " - is simple!");
        }
        else{
            System.out.println(number + " - is combine!");
        }
    }
}
