package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int BOUND = 10;
    private static final int COUNT = 3;
    private static final int MIN = 5;

    public static void play(Random random) {
        String[][] requestResponses = new String[COUNT][];
        for (int i = 0; i < COUNT; i++) {
            int length = random.nextInt(BOUND) + MIN;
            int first = random.nextInt(BOUND);
            int hiddenIndex = random.nextInt(length);
            int step = random.nextInt(BOUND) + 1;
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
