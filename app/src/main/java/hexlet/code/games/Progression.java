package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static String[][] generateRoundData() {
        String[][] data = new String[3][2];
        String[] array = new String[10];
        int count = 0;
        int n;
        int step;
        int position;
        for (int i = 0; i < Engine.countRound; i++) {
            data[i][0] = "";
            n = Utils.getRandomInt(0,20);
            step = Utils.getRandomInt(1,5);
            position = Utils.getRandomInt(0,10);
            array[0] = Integer.toString(n);
            for (int j = 1; j < 10; j++) {
                int temp = Integer.parseInt(array[j-1])+step;
                array[j] = Integer.toString(temp);
            }
            data[i][1] = array[position];
            array[position] = "..";
            data[i][0] = String.join(" ", array);
        }
        return data;
    }

    public static void runGame() {
        String[][] data = new String[3][2];
        System.out.println("What number is missing in the progression?");
        data = generateRoundData();
        Engine.game(data);
    }
}

