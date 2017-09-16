public class Sixty_7 {
    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
        Incrementable.increment();

    }
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
    StaticTest st1 = new StaticTest();
    StaticTest st2 = new StaticTest();
}

class StaticTest{
    static int i = 47;
}

