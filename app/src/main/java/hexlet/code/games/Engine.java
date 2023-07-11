package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    private static final int GAME_GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_EXIT = 0;

    private static final String OPERATOR_PLUS = "+";
    private static final String OPERATOR_MINUS = "-";
    private static final String OPERATOR_MULTIPLY = "*";

    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 20;

    private static final int RANDOM_MIN_EVEN = 1;
    private static final int RANDOM_MAX_EVEN = 100;

    private static final int RANDOM_MIN_PRIME = 1;
    private static final int RANDOM_MAX_PRIME = 100;

    private static final int RANDOM_MIN_GCD = 1;
    private static final int RANDOM_MAX_GCD = 20;

    private static final int[] PROGRESSION_NUMBERS = {2, 3, 4, 5, 7};

    private static final int PROGRESSION_LENGTH = 10;
    private static final int PROGRESSION_RANDOM_MAX = 15;

    private static final String PROGRESSION_MARKER = "..";
    private static int rand;
    private static int rand2;
    private static int indRand;
    private static int answer;
    private static String answerStr;

    public static int calcCal(int a, int b, String str) {
        if (str.equals(OPERATOR_PLUS)) {
            return a + b;
        } else if (str.equals(OPERATOR_MINUS)) {
            return a - b;
        } else if (str.equals(OPERATOR_MULTIPLY)) {
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
        String[] oper = {OPERATOR_PLUS, OPERATOR_MINUS, OPERATOR_MULTIPLY};
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * (RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN);
            rand2 = (int) (Math.random() * (RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN);
            indRand = (int) (Math.random() * 3);
            System.out.println("Question: " + rand + " " + oper[indRand] + " " + rand2);
            System.out.print("Your answer: ");
            answer = scan.nextInt();
            System.out.println();
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


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * (RANDOM_MAX_EVEN - RANDOM_MIN_EVEN + 1) + RANDOM_MIN_EVEN);
            System.out.println("Question: " + rand);
            System.out.print("Your answer: ");
            answerStr = scan.nextLine();
            System.out.println();
            if (rand % 2 != 0 && answerStr.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else if (rand % 2 == 0 && answerStr.equals("no")) {
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

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * (RANDOM_MAX_PRIME - RANDOM_MIN_PRIME + 1) + RANDOM_MIN_PRIME);
            System.out.println("Question: " + rand);
            System.out.print("Your answer: ");
            answerStr = scan.nextLine();
            System.out.println();
            if (!Engine.isPride(rand) && answerStr.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else if (Engine.isPride(rand) && answerStr.equals("no")) {
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
        int[] arr = PROGRESSION_NUMBERS;
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            indRand = (int) (Math.random() * 4);
            rand = (int) (Math.random() * (RANDOM_MAX_GCD - RANDOM_MIN_GCD + 1) + RANDOM_MIN_GCD) * arr[indRand];
            rand2 = (int) (Math.random() * (RANDOM_MAX_GCD - RANDOM_MIN_GCD + 1) + RANDOM_MIN_GCD) * arr[indRand];
            System.out.println("Question: " + rand + " " + rand2);
            System.out.print("Your answer: ");
            answer = scan.nextInt();
            System.out.println();
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
        int[] arr = new int[PROGRESSION_LENGTH];
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            rand = (int) (Math.random() * (PROGRESSION_RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN);
            indRand = (int) (Math.random() * PROGRESSION_LENGTH);
            System.out.print("Question: ");
            for (int j = 0, sum = 0; j < PROGRESSION_LENGTH; j++) {
                sum += rand + indRand;
                arr[j] = sum;
                if (j == indRand) {
                    if (i == PROGRESSION_LENGTH - 1) {
                        System.out.print(PROGRESSION_MARKER);
                    } else {
                        System.out.print(PROGRESSION_MARKER + " ");
                    }
                    continue;
                }
                if (i == PROGRESSION_LENGTH - 1) {
                    System.out.print(arr[j]);
                } else {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");
            answer = scan.nextInt();
            System.out.println();
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

