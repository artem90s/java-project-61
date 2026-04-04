package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NO;
import static hexlet.code.Engine.RANDOM;
import static hexlet.code.Engine.YES;

public class Even {

    public static void play() {
        String[][] requestResponses = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int digital = RANDOM.nextInt(Engine.BOUND) + 1;
            requestResponses[i] = new String[]{String.valueOf(digital), check(digital) ? YES : NO};
        }
        Engine.start("Answer 'yes' if the number is even, otherwise answer 'no'.", requestResponses);
    }

    private static boolean check(int d) {
        return d % 2 == 0;
    }
}
