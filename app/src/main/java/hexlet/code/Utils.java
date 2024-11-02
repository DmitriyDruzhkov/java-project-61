package hexlet.code;
import java.util.Random;
public class Utils {
    public static final int HUNDRED = 100;
    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(min, max);
    }
}
