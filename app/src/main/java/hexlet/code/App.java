package hexlet.code;

import java.util.Scanner;

public class App {
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
                Engine.start(choice);
            }
        }
    }
}
