package hexlet.code;
import java.util.Scanner;

import static hexlet.code.Engine.scanner;

public class Cli {
    public static String name;
    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
