/**
 * Ќаписать программу, в которой в консоль будет выводитс€ название мес€ца и сезон,
 * к которму этот мес€ц относитс€ (написать с помощью  if  и с помощью switch)
 */
import java.util.Scanner;
public class HomeWork3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        String month = sc.nextLine();
        switch (month) {
            case "September", "October", "November" -> System.out.println(month + " - autumn");
            case "December", "January", "February" -> System.out.println(month + " - winter");
            case "March", "April", "May" -> System.out.println(month + " - spring");
            case "June", "July", "August" -> System.out.println(month + " - summer");
            case " " ->  System.out.println("Invalid month!");         //???

        }

    }
}
