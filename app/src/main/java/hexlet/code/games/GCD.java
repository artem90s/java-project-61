package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int BOUND = 99;
    private static final int COUNT = 3;

    public static void play(Random random) {
        String[][] requestResponses = new String[COUNT][];
        for (int i = 0; i < COUNT; i++) {
            int first = random.nextInt(BOUND) + 1;
            int second = random.nextInt(BOUND) + 1;
            requestResponses[i] = new String[]{String.format(first + " " + second), String.valueOf(gcd(first, second))};
        }
        Engine.start("Find the greatest common divisor of given numbers.", requestResponses);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
