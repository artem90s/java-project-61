package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final Random RANDOM = new SecureRandom();
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void start(int choice) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name;
        try (Scanner scanner = new Scanner(System.in)) {
            name = scanner.nextLine();
            System.out.printf("Hello, %s!%n", name);

            switch (choice) {
                case EVEN -> {
                    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                    Even.play(name, RANDOM);
                }
                case CALC -> {
                    System.out.println("What is the result of the expression?");
                    Calc.play(name, RANDOM);
                }
                case GCD_GAME -> {
                    System.out.println("Find the greatest common divisor of given numbers.");
                    GCD.play(name, RANDOM);
                }
                case PROGRESSION -> {
                    System.out.println("What number is missing in the progression?");
                    Progression.play(name, RANDOM);
                }
                case PRIME -> {
                    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                    Prime.play(name, RANDOM);
                }
                default -> {
                }
            }
        }
    }
}
