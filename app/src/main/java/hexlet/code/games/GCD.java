package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class GCD {
    static Scanner scanner = new Scanner(System.in);

    private static String[][] generateRoundData() {
        String[][] data = new String[Engine.countround][3];
        for (int i = 0; i < Engine.countround; i++) {
            int x = Utils.getRandomInt(0, 100);
            int y = Utils.getRandomInt(0, 100);
            data[i][0] = Integer.toString(x) + " " + Integer.toString(y);
            data[i][1] = Integer.toString(nod1(x, y));
        }
        return data;
    }


    public static int nod1(int x, int y) {
        int min;
        int nod = 0;
        if (x > y) {
            min = y;
        } else {
            min = x;
        }
        for (int i = y; i > 1; i--) {
            if (x % i == 0 && y % i == 0) {
                nod = i;
                break;
            } else nod = 1;
        }
        return nod;
    }

    public static void runGame() {
        String[][] data = new String[2][2];
        String rule = "Find the greatest common divisor of given numbers.";
        data = generateRoundData();
        Engine.game(data, rule);
    }
}
