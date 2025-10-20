package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
