/**
 * ������� ������������� ��������� ��������� a � b, ����������, ����� �� ���
 * ��������� ������� ������� ��������� �������� r.
 */
import java.util.Scanner;

public class HomeWork3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ �: ");
        int a = sc.nextInt();
        System.out.println("�������� ������ b: ");
        int b = sc.nextInt();
        System.out.println("������� ������ r: ");
        int r = sc.nextInt();
        double pi = 3.14;
        if(pi * r * r >= a * b){
            System.out.println("��������� ����� ������� ���������");
        }
        else{
            System.out.println("��������� ������ ������� ���������");
        }

    }
}
