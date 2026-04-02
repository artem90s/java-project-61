package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String YES = "yes";
    private static final String NO = "no";

    private static final int BOUND = 99;
    private static final int COUNT = 3;

    public static void play(Random random) {
        String[][] requestResponses = new String[COUNT][];

        for (int i = 0; i < COUNT; i++) {
            int digital = random.nextInt(BOUND);
            requestResponses[i] = new String[]{String.valueOf(digital), isPrime(digital) ? YES : NO};
        }
        Engine.start("Answer 'yes' if given number is prime. Otherwise answer 'no'.", requestResponses);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = COUNT; i * i <= n; i += 2) {
            if (n % i == 0) {
                return true;
            }
        }
        return true;
    }
}
