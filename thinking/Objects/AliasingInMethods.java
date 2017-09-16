public class AliasingInMethods {
    float value;
    static void changeValue(AliasingInMethods instance) {
        instance.value += 4.0f;
    }

    public static void main(String[] args) {
        AliasingInMethods instance = new AliasingInMethods();
        instance.value = 5.5123f;
        System.out.println(instance.value);
        changeValue(instance);
        System.out.println(instance.value);
    }
}
