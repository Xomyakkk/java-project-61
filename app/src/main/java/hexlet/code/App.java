package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Calc.calc;
import static hexlet.code.Cli.greetings;
import static hexlet.code.Gsd.gcd;
import static hexlet.code.Progression.progression;

public class App {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("""
                Please enter the game number end press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                0 -  Exit""");

        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        System.out.println("Your choice: " + choice);

        switch(choice) {
            case "1":
                greetings();
                break;
            case "2":
                Even.even();
                break;
            case "3":
                calc();
                break;
            case "4":
                gcd();
                break;
            case "5":
                progression();
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
