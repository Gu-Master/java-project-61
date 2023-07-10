package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String isName(String name) {
        System.out.println("What is your name !?");
        System.out.print("My name is - ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println("Ok, your name is " + name);
        return name;
    }


}

