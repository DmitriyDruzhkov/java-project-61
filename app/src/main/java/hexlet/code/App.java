package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String game = scanner.nextLine();
        System.out.println("Your choice: " + game);
        switch (game) {
            case "1":
                System.out.println("Welcome to the Brain Games!");
                break;
            case "2":
                Even.runGame();
                break;
            case "3":
                Calculator.runGame();
                break;
            case "4":
                GCD.runGame();
                break;
            case "5":
                Progression.runGame();
                break;
            case "6":
                Prime.runGame();
                break;
            case "0":
                System.exit(0);
                break;
        }
    }
}