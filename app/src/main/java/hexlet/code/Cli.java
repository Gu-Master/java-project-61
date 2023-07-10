package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String isName(String name) {
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.print("Hello, " + name + "!");
        return name;
    }


}

