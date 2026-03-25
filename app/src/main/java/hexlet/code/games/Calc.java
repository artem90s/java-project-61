package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    private static final int BOUND = 49;
    private static final  int COUNT = 3;
    public static void play(String name, Random random) {

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < COUNT; i++) {
                int first = random.nextInt(BOUND) + 1;
                int second = random.nextInt(BOUND) + 1;
                char[] operations = {'+', '-', '*'};
                char operation = operations[random.nextInt(operations.length)];
                System.out.printf("Question: %d %c %d%n", first, operation, second);
                if (scanner.hasNext()) {
                    String answer = scanner.nextLine().trim().toLowerCase();
                    System.out.printf("Your answer: %s%n", answer);
                    String res = String.valueOf(compute(first, operation, second));
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

    private static int compute(int first, char operation, int second) {
        return switch (operation) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            default -> throw new IllegalArgumentException("Неизвестная операция: " + operation);
        };
    }
}
