package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calculator {


    private static String[][] generateRoundData() {
        String[][] data = new String[Engine.countround][Engine.countround];
        for (int i = 0; i < Engine.countround; i++) {
            var operation = getRandomChar();
            int x = Utils.getRandomInt(0, Utils.THIRTY);
            int y = Utils.getRandomInt(0, Utils.THIRTY);
            data[i][0] = Integer.toString(x) + " " + Character.toString(operation) + " " + Integer.toString(y);
            data[i][1] = Integer.toString(calculate(operation, x, y));
        }
        return data;
    }

    public static void runGame() {
        String[][] data = new String[2][2];
        String rule = "What is the result of the expression?";
        data = generateRoundData();
        Engine.game(data, rule);
    }

    public static int calculate(char operation, int x, int y) {
        int sum = 0;
        switch (operation) {
            case '+':
                sum = x + y;
                break;
            case '-':
                sum = x - y;
                break;
            case '*':
                sum = x * y;
                break;
        }
        return sum;
    }
    public static char getRandomChar() {
        char[] symb = {
                '+',
                '-',
                '*'
        };
        Random rand = new Random();
        return symb[rand.nextInt(symb.length)];
    }
}
