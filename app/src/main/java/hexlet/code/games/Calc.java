package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.RANDOM;

public class Calc {
    public static void play() {
        String[][] requestResponses = new String[Engine.ROUNDS][];
            for (int i = 0; i < Engine.ROUNDS; i++) {
                int first = RANDOM.nextInt(Engine.BOUND) + 1;
                int second = RANDOM.nextInt(Engine.BOUND) + 1;
                char[] operations = {'+', '-', '*'};
                char operation = operations[RANDOM.nextInt(operations.length)];
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
