import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        String result;
        Random random = new Random();
        int i = random.nextInt(100);
        result = (i < 50) ? "Heads" : "Tails";
        System.out.println(result);
    }
}
