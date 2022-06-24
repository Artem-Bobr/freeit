/**
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */
import java.util.Scanner;

public class HomeWork3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер а: ");
        int a = sc.nextInt();
        System.out.println("Ввведите размер b: ");
        int b = sc.nextInt();
        System.out.println("Введите радиус r: ");
        int r = sc.nextInt();
        double pi = 3.14;
        if(pi * r * r >= a * b){
            System.out.println("Отверстие можно закрыть полностью");
        }
        else{
            System.out.println("Отверстие нельзя закрыть полностью");
        }

    }
}
