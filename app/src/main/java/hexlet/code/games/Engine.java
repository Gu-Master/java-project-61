package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    //1 - Greet
    //2 - Even
    //3 - Calc
    //0 - Exit
    public static int calcCal(int a, int b, String str) {
        if (str.equals("+")) {
            return a + b;
        } else if (str.equals("-")) {
            return a - b;
        } else if (str.equals("*")) {
            return a * b;
        }
        return 0;
    }

    public static int evcld(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public static boolean isPride(int a) {
        boolean flag = true;
        if (a == 2) {
            return true;
        }
        for (int i = 2; i < a - 1; i++) {
            if (a % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void calc(String name) {
        Scanner scan = new Scanner(System.in);
        int answer;
        int rand;
        int rand2;
        int indRand;
        String[] oper = {"+", "-", "*"};
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * (20 - 1) + 1);
            rand2 = (int) (Math.random() * (20 - 1) + 1);
            indRand = (int) Math.random() * 3;
            System.out.println("Question: " + rand + " " + oper[indRand] + " " + rand2);
            System.out.print("Your answer: ");
            answer = scan.nextInt();
            System.out.print("");
            if (Engine.calcCal(rand, rand2, oper[indRand]) != answer) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + Engine.calcCal(rand, rand2, oper[indRand]) + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            }
        }
    }

    public static void even(String name) {
        Scanner scan = new Scanner(System.in);
        String answer = new String();
        int rand;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * (100 - 1) + 1);
            System.out.println("Question: " + rand);
            System.out.print("Your answer: ");
            answer = scan.nextLine();
            System.out.print("");
            if (rand % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else if (rand % 2 == 0 && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            }
        }
    }

    public static void pride(String name) {
        Scanner scan = new Scanner(System.in);
        String answer = new String();
        int rand;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * (100 - 1) + 1);
            System.out.println("Question: " + rand);
            System.out.print("Your answer: ");
            answer = scan.nextLine();
            System.out.print("");
            if (!Engine.isPride(rand) && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else if (Engine.isPride(rand) && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            }
        }
    }

    public static void gcd(String name) {
        Scanner scan = new Scanner(System.in);
        int answer;
        int rand;
        int rand2;
        int indRand;
        int[] arr = {2, 3, 4, 5, 7};
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {

            indRand = (int) Math.random() * 4;
            rand = (int) (Math.random() * (20 - 1) + 1) * arr[indRand];
            rand2 = (int) (Math.random() * (20 - 1) + 1) * arr[indRand];
            System.out.println("Question: " + rand + " " + rand2);
            System.out.print("Your answer: ");
            answer = scan.nextInt();
            System.out.print("");
            if (Engine.evcld(rand, rand2) != answer) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + Engine.evcld(rand, rand2) + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            }
        }
    }

    public static void progress(String name) {
        Scanner scan = new Scanner(System.in);
        int answer;
        int rand;
        int rand2;
        int indRand;
        int[] arr = new int[10];
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * (15 - 1) + 1);
            indRand = (int) (Math.random() * 10);
            System.out.print("Question: ");
            for (int j = 0, sum = 0; j < 10; j++) {
                sum += rand + indRand;
                arr[j] = sum;
                if (j == indRand) {
                    System.out.print(" ..");
                    continue;
                }
                System.out.print(" " + arr[j]);
            }
            System.out.println("");
            System.out.print("Your answer: ");
            answer = scan.nextInt();
            System.out.print("");
            if (arr[indRand] != answer) {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + arr[indRand] + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            }
        }
    }
}
