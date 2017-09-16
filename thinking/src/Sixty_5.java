public class Sixty_5 {
    static class DataOnly {
        int i;
        double d;
        boolean b;
    }

    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println("i = " + data.i + "; d = " + data.d + "; b = " + data.b);
    }
}
