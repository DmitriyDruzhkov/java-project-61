package hexlet.code;
import java.util.Random;
public class Utils {
    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(min, max );
    }

    public static Character getRandomChar() {
        char[] symb = {'+', '-', '*'};
        Random rand = new Random();
        return symb[rand.nextInt(symb.length)];
    }
}