package hexlet.code;

import static hexlet.code.Cli.greetings;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        switch(choice) {
            case "1":
                greetings();
                break;
            case "0":
                break;
            default:
                System.out.println("Invalid input");
                menu();
                break;
        }
    }
}
