package hexlet.code.games;
import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    public static Scanner scanner = new Scanner(System.in);


    private static String[][] generateRoundData() {
        String[][] data = new String[3][2];
        for (int i = 0; i < Engine.countRound; i++) {
            int rc = Utils.getRandomInt(0,100);
            data[i][0] = Integer.toString(rc);
            data[i][1] = evenOrNot(rc) ? "yes" : "no";
        }
        return data;
    }

    private static boolean evenOrNot(int check){
        return check % 2 == 0;
    }

    public static void runGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[][] data = new String[3][2];
        data = generateRoundData();
        Engine.game(data);
    }
}



