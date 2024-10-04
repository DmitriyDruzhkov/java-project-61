package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    static int sum = 0;


    private static String[][] generateRoundData() {
        String[][] data = new String[3][2];
        for (int i = 0; i < 3; i++) {
            var operation = Utils.getRandomChar();
            int x = Utils.getRandomInt(0,30);
            int y = Utils.getRandomInt(0,30);
            data[i][0] = Integer.toString(x) + Character.toString(operation) + Integer.toString(y);
            data[i][1] = Integer.toString(calculate(operation, x, y));
        }
        return data;
    }

    public static void runGame() {
            String[][] data = new String[3][2];
            System.out.println("What is the result of the expression?");
            data = generateRoundData();
            Engine.game(data);
            }

        public static int calculate (char operation,int x, int y){
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
}

