package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.RANDOM;

public class GCD {

    public static void play() {
        String[][] requestResponses = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int first = RANDOM.nextInt(Engine.BOUND) + 1;
            int second = RANDOM.nextInt(Engine.BOUND) + 1;
            requestResponses[i] = new String[]{String.format(first + " " + second), String.valueOf(gcd(first, second))};
        }
        Engine.start("Find the greatest common divisor of given numbers.", requestResponses);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
