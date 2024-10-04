package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static String[][] generateRoundData() {
        String[][] data = new String[3][2];
        int[] array = new int[10];
        int count = 0;
        int n;
        int step;
        int position;
        for (int i = 0; i < 3; i++) {
            data[i][0] = "";
            n = Utils.getRandomInt(0,20);
            step = Utils.getRandomInt(1,5);
            position = Utils.getRandomInt(0,10);
            array[0] = n;
            for (int j = 1; j < 10; j++) {
                array[j] = array[j - 1] + step;
            }
            for (int k = 0; k < array.length; k++) {
                if (k == position) {
                    data[i][0] = data[i][0] + " ..";
                    data[i][1] = Integer.toString(array[k]);
                } else data[i][0] = data[i][0] + " " + Integer.toString(array[k]);
            }
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

