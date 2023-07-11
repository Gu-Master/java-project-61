package hexlet.code;

import hexlet.code.games.Engine;

import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int EVEN = 2;
    private static final int GCD = 4;
    private static final int CALC = 3;
    private static final int PROGRESS = 5;
    private static final int PRIDE = 6;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Pride");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choise = scan.nextInt();
        if (choise == EXIT) {
            return;
        }
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        String name = "";
        name = Cli.isName(name);

        scan.nextLine();
        System.out.println("");
        if (choise == EVEN) {
            Engine.even(name);
        } else if (choise == CALC) {
            Engine.calc(name);
        } else if (choise == GCD) {
            Engine.gcd(name);
        } else if (choise == PROGRESS) {
            Engine.progress(name);
        } else if (choise == PRIDE) {
            Engine.pride(name);
        }


    }
}
