package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    private static final int BOUND = 99;
    private static final int COUNT = 3;
    public static void play(String name, Random random) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < COUNT; i++) {
                int first = random.nextInt(BOUND) + 1;
                int second = random.nextInt(BOUND) + 1;
                System.out.printf("Question: %d %d%n", first, second);
                if (scanner.hasNext()) {
                    String answer = scanner.nextLine().trim().toLowerCase();
                    System.out.printf("Your answer: %s%n", answer);
                    String res = String.valueOf(gcd(first, second));
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

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
