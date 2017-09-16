public class ThreeDogs {
    String name;
    String voice;

    public static void main(String[] args) {
        ThreeDogs spot = new ThreeDogs();
        spot.name = "spot";
        spot.voice = "Ruff!";
        ThreeDogs scruffy = new ThreeDogs();
        scruffy.name = "scruffy";
        scruffy.voice = "Wurf!";
        System.out.println("This dog is called " + spot.name + ". " + spot.name + ", bark! \"" + spot.voice + "\"");
        System.out.println("And this dog is called " + scruffy.name + ". " + scruffy.name + ", bark! \"" + scruffy.voice + "\"");
        ThreeDogs newDog = spot;
        System.out.println(spot == scruffy);
        System.out.println(spot == newDog);
        System.out.println(newDog == scruffy);
        System.out.println(spot.equals(scruffy));
        System.out.println(spot.equals(newDog));
        System.out.println(newDog.equals(scruffy));
    }
}
