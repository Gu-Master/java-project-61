package hexlet.code;

import hexlet.code.games.Engine;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("6 - Pride");
        System.out.println("5 - Progression");
        System.out.println("4 - GCD");
        System.out.println("3 - Calc");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choise = scan.nextInt();
        if (choise == 0 || choise < 1 || choise > 6) {
            return;
        }
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        String name = "";
        name = Cli.isName(name);

        scan.nextLine();
        System.out.println("");
        if (choise == 2) {
            Engine.even(name);
        } else if (choise == 3) {
            Engine.calc(name);
        } else if (choise == 4) {
            Engine.gcd(name);
        } else if (choise == 5) {
            Engine.progress(name);
        } else if (choise == 6) {
            Engine.pride(name);
        }


    }
}
