package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final String YES = "yes";
    private static final String NO = "no";

    private static final int BOUND = 99;
    private static final int COUNT = 3;

    public static void play(String name, Random random) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < COUNT; i++) {
                int digital = random.nextInt(BOUND);
                System.out.printf("Question: %d%n", digital);
                if (scanner.hasNext()) {
                    String answer = scanner.nextLine().trim().toLowerCase();
                    System.out.printf("Your answer: %s%n", answer);
                    String res = isPrime(digital);
                    if (answer.equals(res)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", answer, res);
                        System.out.printf("Let's try again, %s!%n", name);
                        return;
                    }

                }
            }
            System.out.printf("Congratulations, %s!", name);
        }
    }

    private static String isPrime(int n) {
        if (n <= 1) {
            return NO;
        }
        if (n == 2) {
            return YES;
        }
        if (n % 2 == 0) {
            return NO;
        }

        for (int i = COUNT; i * i <= n; i += 2) {
            if (n % i == 0) {
                return NO;
            }
        }
        return YES;
    }
}
