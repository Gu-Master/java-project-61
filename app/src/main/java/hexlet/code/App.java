package hexlet.code;

import hexlet.code.games.Engine;

import java.util.Scanner;

public class App {
    static int exit = 0;
    static int gameEven = 2;
    static int gameGCD = 4;
    static int gameCalc = 3;
    static int gameProgres = 5;
    static int gamePride = 6;

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
        if (choise == exit) {
            return;
        }
        System.out.println("");
        System.out.println("Welcome to the Brain Games!");
        String name = "";
        name = Cli.isName(name);

        scan.nextLine();
        System.out.println("");
        if (choise == gameEven) {
            Engine.even(name);
        } else if (choise == gameCalc) {
            Engine.calc(name);
        } else if (choise == gameGCD) {
            Engine.gcd(name);
        } else if (choise == gameProgres) {
            Engine.progress(name);
        } else if (choise == gamePride) {
            Engine.pride(name);
        }


    }
}
