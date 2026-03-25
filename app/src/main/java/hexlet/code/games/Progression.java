package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Progression {
    private static final int BOUND = 10;
    private static final int COUNT = 3;
    private static final int MIN = 5;
    public static void play(String name, Random random) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < COUNT; i++) {
                int length = random.nextInt(BOUND) + MIN;
                int start = random.nextInt(BOUND);
                int secret = random.nextInt(length);
                int step = random.nextInt(BOUND) + 1;
                List<Integer> subsequence = createSubsequence(length, start, step);
                String question = subsequence.stream()
                        .map(String::valueOf)
                        .map(v -> {
                            if (subsequence.indexOf(Integer.valueOf(v)) == secret) {
                                v = "..";
                            }
                            return v;
                        })
                        .collect(Collectors.joining(" "));
                System.out.printf("Question: %s%n", question);
                if (scanner.hasNext()) {
                    String answer = scanner.nextLine().trim().toLowerCase();
                    System.out.printf("Your answer: %s%n", answer);
                    String res = check(subsequence, secret);
                    if (answer.equals(res)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", answer, res);
                        System.out.printf("Let's try again, %s!%n", name);
                        return;
                    }

                }
            }
            System.out.printf("Congratulations, %s!", name);
        }
    }

    private static List<Integer> createSubsequence(int length, int start, int step) {
        List<Integer> list = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            int currentElement = start + i * step;
            list.add(i, currentElement);
        }
        return list;
    }

    private static String check(List<Integer> list, int secret) {
        return list.get(secret).toString();
    }
}
