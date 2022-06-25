/**
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */
import java.util.Scanner;

public class HomeWork3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер а: ");
        double a = sc.nextDouble();
        System.out.println("Ввведите размер b: ");
        double b = sc.nextDouble();
        System.out.println("Введите радиус r: ");
        double r = sc.nextDouble();
        double c = Math.sqrt(a*a + b*b);
        if(2 * r >= c){
            System.out.println("Отверстие можно закрыть полностью");
        }
        else{
            System.out.println("Отверстие нельзя закрыть полностью");
        }

    }
}
