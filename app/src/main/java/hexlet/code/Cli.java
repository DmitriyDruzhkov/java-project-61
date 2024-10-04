package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String name;
    static Scanner scanner = new Scanner(System.in);
    public static void input() {
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
