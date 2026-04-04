package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;


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
                    case EVEN -> Even.play();
                    case CALC -> Calc.play();
                    case GCD_GAME -> GCD.play();
                    case PROGRESSION -> Progression.play();
                    case PRIME -> Prime.play();
                    default -> System.out.println("Unknown user choice" + choice);
                }
            }
        }
    }
}
