package com.ArtemBobr.HomeWork_3;
import java.util.Random;
public class HomeWork3_3 {
/**
Имеется целое число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
0 рублей
1 рубль
2 рубля
3 рубля
4 рубля
5 рублей
6 рублей
7 рублей
8 рублей
9 рублей
 123213124124
 **/

    public static void main(String[] args) {
        Random rand = new Random();
        int money = rand.nextInt();
        int lastNumber = money % 10;
            switch (lastNumber) {
                case 0,5,-5,6,-6,7,-7,8,-8,9,-9 -> System.out.println(money + " рублей");
                case 1,-1 -> System.out.println(money + " рубль");
                case 2,-2,3,-3,4,-4 -> System.out.println(money + " рубля");
            }
}
}



