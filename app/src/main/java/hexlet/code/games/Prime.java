package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NO;
import static hexlet.code.Engine.RANDOM;
import static hexlet.code.Engine.YES;

public class Prime {
     public static void play() {
        String[][] requestResponses = new String[Engine.ROUNDS][];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int digital = RANDOM.nextInt(Engine.BOUND);
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

        for (int i = Engine.ROUNDS; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
