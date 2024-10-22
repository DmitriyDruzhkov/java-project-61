package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static String[][] generateRoundData() {
        String[][] data = new String[Engine.countRound][3];
        data[2][2] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int n;
        for (int i = 0; i < Engine.countRound; i++) {
            n = Utils.getRandomInt(2, 20);
            data[i][0] = Integer.toString(n);
            data[i][1] = checkNumber(n) ? "yes" : "no";
        }
        return data;
    }


    private static boolean checkNumber(int n) {
        boolean answer;
        int check = 0;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                check++;
            }
        }
        if (check > 0) {
            answer = false;
        } else {
            answer = true;
        }
        return answer;
    }

    public static void runGame() {
        String[][] data = new String[3][2];
        data = generateRoundData();
        Engine.game(data);
    }
}