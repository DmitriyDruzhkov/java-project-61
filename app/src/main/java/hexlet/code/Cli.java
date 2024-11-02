package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;
    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
