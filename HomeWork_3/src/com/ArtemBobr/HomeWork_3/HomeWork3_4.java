/**
 * Ќаписать программу, котора€ приветствует пользовател€
 * в зависимости от его пола и возраста
 * (им€, пол и возраст задаютс€ при старте программы)
 */
import java.util.Scanner;
public class HomeWork3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = sc.nextByte();
        if(age < 18){
            System.out.println("Only 18+!");
            System.exit(0);
        }
        System.out.println("Enter your name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Enter your gender: ");
        String gender = sc.nextLine();

            if(gender.equals("male")){
                System.out.println("Hello " + name + "! " + "Lets drink beer!");
            }
            else if (gender.equals("female")){
                System.out.println("Hello " + name + "! " + "Lets drink wine!");
            }
            else{
                System.out.println("Invalid gender!");
            }


        }

    }

