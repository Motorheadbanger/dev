public class Aliasing {
    float value = 0.0f;

    public static void main(String[] args) {
        Aliasing a1 = new Aliasing();
        a1.value = 1.1f;
        Aliasing a2 = new Aliasing();
        a2.value = 1.2f;
        a1 = a2;
        a2.value = 9999.9f;
        System.out.println(a1.value);
        System.out.println(a2.value);
    }
}
