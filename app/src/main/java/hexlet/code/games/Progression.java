package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.RANDOM;

public class Progression {
    public static final int BOUND = 99;
    private static final int MIN = 5;

    public static void play() {
        String[][] requestResponses = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int length = RANDOM.nextInt(BOUND) + MIN;
            int first = RANDOM.nextInt(BOUND);
            int hiddenIndex = RANDOM.nextInt(length);
            int step = RANDOM.nextInt(BOUND) + 1;
            String[] progression = makeProgression(length, first, step);
            String answer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);
            requestResponses[i] = new String[]{question, answer};
        }
        Engine.start("What number is missing in the progression?", requestResponses);
    }

    private static String[] makeProgression(int length, int start, int step) {
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            int currentElement = start + i * step;
            array[i] = String.valueOf(currentElement);
        }
        return array;
    }
}
