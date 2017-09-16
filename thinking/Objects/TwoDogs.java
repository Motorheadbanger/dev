public class TwoDogs {
    String name;
    String voice;

    public static void main(String[] args) {
        TwoDogs spot = new TwoDogs();
        spot.name = "spot";
        spot.voice = "Ruff!";
        TwoDogs scruffy = new TwoDogs();
        scruffy.name = "scruffy";
        scruffy.voice = "Wurf!";
        System.out.println("This dog is called" + spot.name + ". " + spot.name + ", bark! \"" + spot.voice + "\"");
        System.out.println("And this dog is called" + scruffy.name + ". " + scruffy.name + ", bark! \"" + scruffy.voice + "\"");
    }
}
