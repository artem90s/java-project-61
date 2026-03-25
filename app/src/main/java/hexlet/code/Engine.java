package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static void start(int choice) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name;
        try (Scanner scanner = new Scanner(System.in)) {
            name = scanner.nextLine();
            System.out.printf("Hello, %s!%n", name);
            switch (choice) {
                case 2 -> {
                    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                    Even.play(name);
                }
                case 3 -> {
                    System.out.println("What is the result of the expression?");
                    Calc.play(name);
                }
                case 4 -> {
                    System.out.println("Find the greatest common divisor of given numbers.");
                    GCD.play(name);
                }
                case 5 -> {
                    System.out.println("What number is missing in the progression?");
                    Progression.play(name);
                }
                case 6 -> {
                    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                    Prime.play(name);
                }
                default -> {
                }
            }
        }
    }
}
