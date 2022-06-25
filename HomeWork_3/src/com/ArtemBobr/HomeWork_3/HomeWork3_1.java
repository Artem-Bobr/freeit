/**Создайте число. Определите, является ли число трехзначным. Определите, является
*ли его последняя цифра семеркой. Определите, является ли число четным.
 */


import java.util.Scanner;

public class HomeWork3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = sc.nextInt();
        if(isThreeDigit(i)){
            System.out.println("Число трёхзначное: " + isThreeDigit(i));
        }
        else{
            System.out.println("Число трёхзначное: " + isThreeDigit(i));
        }
        if(isLastDigit(i)){
            System.out.println("Последняя цифра семёрка: " + isLastDigit(i));
        }
        else{
            System.out.println("Последняя цифра семёрка: " + isLastDigit(i));
        }
        if(isEven(i)){
            System.out.println("Число чётное: " + isEven(i));
        }
        else{
            System.out.println("Число чётное: " + isEven(i));
        }
    }



    private static boolean isThreeDigit(int i){
        if(i >= 100 && i <= 999){
            return true;
        }
        else{
            return false;
        }
    }
    private static boolean isLastDigit(int i){
        if(i % 10 == 7){
            return true;
        }
        else{
            return false;
        }
    }
    private static boolean isEven(int i){
        if(i % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
