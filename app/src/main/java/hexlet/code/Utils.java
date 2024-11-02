package hexlet.code;
import java.util.Random;
public class Utils {
    public static final int HUNDRED = 100;
    public static final int FIVE = 5;
    public static final int TEN = 10;
    public static final int TWENTY = 20;
    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(min, max);
    }
}
