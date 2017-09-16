public class Sixty_6 {
    int storage(String s) {
        return s.length() * 2;
    }
    public static void main(String[] args) {
        String s = "Cheerioskates!";
        Sixty_6 a = new Sixty_6();
        System.out.println("Memory needed to store the word \"Cheerioskates\" and an exclamation mark is " + a.storage(s) + " bytes");
    }
}
