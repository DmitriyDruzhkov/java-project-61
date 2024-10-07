package hexlet.code;
import hexlet.code.Cli;
import static hexlet.code.Cli.scanner;
public class Engine {
    public static final int countRound = 3;
    public static void game(String[][] data) {
        for (int i = 0; i < countRound; i++) {
            System.out.println("What is the result of the expression?");
            System.out.println("Question: " + data[i][0]);
            System.out.println("Your answer: ");
            String result = scanner.nextLine();
            if (result.equals(data[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(result + " is wrong answer ;(. Correct answer was " + data[i][1]);
                System.out.println("Let's try again, " + Cli.name);
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + Cli.name);
                break;
            }
        }
    }
}

