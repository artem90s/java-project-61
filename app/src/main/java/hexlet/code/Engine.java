package hexlet.code;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static final Random RANDOM = new SecureRandom();
    public static void start(String words, String[][] matrix) {
        System.out.printf("%nWelcome to the Brain Games!%n");
        System.out.print("May I have your name? ");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            System.out.printf("Hello, %s!%n", name);
            System.out.println(words);
            for (String[] strings : matrix) {
                System.out.printf("Question: %s%n", strings[0]);
                String answer = scanner.nextLine().trim().toLowerCase();
                System.out.printf("Your answer: %s%n", answer);
                if (answer.equals(strings[1])) {
                    System.out.println("Correct!");
                } else {
                    System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", answer, strings[1]);
                    System.out.printf("Let's try again, %s!", name);
                    return;
                }
            }
            System.out.printf("Congratulations, %s!", name);
        }
    }
}
