package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name;
        if (scanner.hasNext()) {
            name=scanner.nextLine();
            System.out.printf("Hello, %s!%n", name);
        }
    }
}
