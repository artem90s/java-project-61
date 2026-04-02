package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final Random RANDOM = new SecureRandom();

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNext()) {
                var choice = Integer.parseInt(sc.next());
                System.out.printf("Your choice: %d%n", choice);
                switch (choice) {
                    case GREET -> Cli.greeting();
                    case EVEN -> Even.play(RANDOM);
                    case CALC -> Calc.play(RANDOM);
                    case GCD_GAME -> GCD.play(RANDOM);
                    case PROGRESSION -> Progression.play(RANDOM);
                    case PRIME -> Prime.play(RANDOM);
                    default -> {
                    }
                }
            }
        }
    }
}
