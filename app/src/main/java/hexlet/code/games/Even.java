package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.RANDOM;

public class Even {
    public static final int BOUND = 99;
    public static final String YES = "yes";
    public static final String NO = "no";
    public static void play() {
        String[][] requestResponses = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int digital = RANDOM.nextInt(BOUND) + 1;
            requestResponses[i] = new String[]{String.valueOf(digital), isEven(digital) ? YES : NO};
        }
        Engine.start("Answer 'yes' if the number is even, otherwise answer 'no'.", requestResponses);
    }

    private static boolean isEven(int d) {
        return d % 2 == 0;
    }
}
