/**
 * �������� �����. ����������, �������� �� ����� �����������. ����������, ��������
 * �� ��� ��������� ����� ��������. ����������, �������� �� ����� ������.
 */


import java.util.Scanner;

public class HomeWork3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� �����: ");
        int i = sc.nextInt();
        if(isThreeDigit(i)){
            System.out.println("����� ����������: " + isThreeDigit(i));
        }
        else{
            System.out.println("����� ����������: " + isThreeDigit(i));
        }
        if(isLastDigit(i)){
            System.out.println("��������� ����� ������: " + isLastDigit(i));
        }
        else{
            System.out.println("��������� ����� ������: " + isLastDigit(i));
        }
        if(isEven(i)){
            System.out.println("����� ������: " + isEven(i));
        }
        else{
            System.out.println("����� ������: " + isEven(i));
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
