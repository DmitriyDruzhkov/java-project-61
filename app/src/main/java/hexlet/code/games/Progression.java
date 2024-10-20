package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static String[] progression(int l, int step, int n ) {
        String[] res = new String[l];
        res[0] = Integer.toString(n);
        for (int j = 1; j < l; j++) {
            int temp = Integer.parseInt(res[j-1])+step;
            res[j] = Integer.toString(temp);
        }
        return res;
    }

    private static String[][] generateRoundData() {
        String[][] data = new String[3][3];
        data[2][2] = "What number is missing in the progression?";
        int position;
        for (int i = 0; i < Engine.countRound; i++) {
            String[] array = progression(10, Utils.getRandomInt(1,5),Utils.getRandomInt(0,20));
            data[i][0] = "";
            position = Utils.getRandomInt(0,10);
            data[i][1] = array[position];
            array[position] = "..";
            data[i][0] = String.join(" ", array);
        }
        return data;
    }

    public static void runGame() {
        String[][] data = new String[3][2];
        data = generateRoundData();
        Engine.game(data);
    }
}

