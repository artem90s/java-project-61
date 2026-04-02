package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int BOUND = 49;
    private static final  int COUNT = 3;
    public static void play(Random random) {
        String[][] requestResponses = new String[COUNT][];
            for (int i = 0; i < COUNT; i++) {
                int first = random.nextInt(BOUND) + 1;
                int second = random.nextInt(BOUND) + 1;
                char[] operations = {'+', '-', '*'};
                char operation = operations[random.nextInt(operations.length)];
                String request = String.format(first + " " + operation + " " + second);
                requestResponses[i] = new String[]{request, String.valueOf(compute(first, operation, second))};
            }
        Engine.start("What is the result of the expression?", requestResponses);
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
