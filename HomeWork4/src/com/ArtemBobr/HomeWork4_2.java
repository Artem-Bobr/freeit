package com.ArtemBobr;

import java.util.Scanner;

/**
 * ��������� ��������� ����� � �������� �� 10 �� 15 (�� ��������� ��������).
 */
public class HomeWork4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number from 10 to 15: ");
        int number = sc.nextInt();
         int factorial = 1;
        if(number < 10 || number > 15){
            System.out.println("Invalid number!");
        }
        else{
            for (int i = 1; i <= number ; i++) {
               factorial = factorial * i;
            }
            System.out.println("Factorial " + number + " = " + factorial );
        }
    }
}
