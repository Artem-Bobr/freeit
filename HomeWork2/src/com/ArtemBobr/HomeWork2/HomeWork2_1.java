package com.ArtemBobr.HomeWork2;

public class HomeWork2_1 {
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int d = h / 24;
        int w = d / 7;


        System.out.println(m + " минут " + sec + " секунд");
        System.out.println(h + " часов " + min + " минут " + sec + " секунд");
        System.out.println(d + " дней " + h + " часов " + min + " минут " + sec + " секунд");
        System.out.println(w + " недель " + d + " дней " + h + " часов " + min + " минут " + sec + " секунд");
    }
}