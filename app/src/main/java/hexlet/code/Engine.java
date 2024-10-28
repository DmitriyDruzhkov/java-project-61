package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static String name;
    static Scanner scanner = new Scanner(System.in);
    public static final int countRound = 3;
    public static void game(String[][] data) {
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(data[2][2]);
        for (int i = 0; i < countRound; i++) {
            System.out.println("Question: " + data[i][0]);
            System.out.println("Your answer: ");
            String result = scanner.nextLine();
            if (!result.equals(data[i][1])) {
                System.out.println(result + " is wrong answer ;(. Correct answer was " + data[i][1]);
                System.out.println("Let's try again, " + name);
                return;
            } else {
                System.out.println("Correct!");
            }
            if (i == 2) {
                System.out.println("Congratulations, " + name);
                break;
            }
        }
    }
}