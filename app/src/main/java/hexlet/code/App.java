package hexlet.code;

import hexlet.code.games.Engine;

import java.util.Scanner;

public class App {
    static final int exit = 0;
    static final int GameEven = 2;
    static final int GameGCD = 4;
    static final int GameCalc = 3;
    static final int GameProg = 5;
    static final int GamePride = 6;

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
        if (choise == GameEven) {
            Engine.even(name);
        } else if (choise == GameCalc) {
            Engine.calc(name);
        } else if (choise == GameGCD) {
            Engine.gcd(name);
        } else if (choise == GameProg) {
            Engine.progress(name);
        } else if (choise == GamePride) {
            Engine.pride(name);
        }


    }
}
