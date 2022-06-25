/**
 * Ќаписать программу, в которой в консоль будет выводитс€ название мес€ца и сезон,
 * к которму этот мес€ц относитс€ (написать с помощью  if  и с помощью switch)
 */
import java.util.Scanner;
public class HomeWork3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        String month = sc.nextLine();
        if (month.equalsIgnoreCase("september")) {
            System.out.println(month + " - autumn");
        }
        else if (month.equalsIgnoreCase("october")) {
            System.out.println(month + " - autumn");
        }
        else if (month.equalsIgnoreCase("november")) {
            System.out.println(month + " - autumn");
        }
        else if (month.equalsIgnoreCase("december")) {
            System.out.println(month + " - winter");
        }
        else if (month.equalsIgnoreCase("january")) {
            System.out.println(month + " - winter");
        }
        else if (month.equalsIgnoreCase("february")) {
            System.out.println(month + " - winter");
        }
        else if (month.equalsIgnoreCase("march")) {
            System.out.println(month + " - spring");
        }
        else if (month.equalsIgnoreCase("april")) {
            System.out.println(month + " - spring");
        }
        else if (month.equalsIgnoreCase("may")) {
            System.out.println(month + " - spring");
        }
        else if (month.equalsIgnoreCase("june")) {
            System.out.println(month + " - summer");
        }
        else if (month.equalsIgnoreCase("july")) {
            System.out.println(month + " - summer");
        }
        else if (month.equalsIgnoreCase("august")) {
            System.out.println(month + " - summer");
        }
        else{
            System.out.println("Invalid month");
        }
    }
}
