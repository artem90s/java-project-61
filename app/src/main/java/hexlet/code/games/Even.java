package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String YES = "yes";
    private static final String NO = "no";

    private static final int BOUND = 99;
    private static final int COUNT = 3;

    public static void play(Random random) {
        String[][] requestResponses = new String[COUNT][];
        for (int i = 0; i < COUNT; i++) {
            int digital = random.nextInt(BOUND) + 1;
            requestResponses[i] = new String[]{String.valueOf(digital), check(digital)};
        }
        Engine.start("Answer 'yes' if the number is even, otherwise answer 'no'.", requestResponses);
    }

    private static String check(int d) {
        if (d % 2 == 0) {
            return YES;
        }
        return NO;
    }
}
