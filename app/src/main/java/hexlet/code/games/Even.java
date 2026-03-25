package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final String YES = "yes";
    private static final String NO = "no";
    public static void play(String name, Random random) {

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                int digital = random.nextInt(99) + 1;
                System.out.printf("Question: %d%n", digital);
                if (scanner.hasNext()) {
                    String answer = scanner.nextLine().trim().toLowerCase();
                    System.out.printf("Your answer: %s%n", answer);
                    if (answer.equals(check(digital))) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                        System.out.printf("Let's try again, %s!%n", name);
                        return;
                    }

                }
            }
            System.out.printf("Congratulations, %s!", name);
        }
    }

    private static String check(int d) {
        if (d % 2 == 0) {
            return YES;
        }
        return NO;
    }
}
