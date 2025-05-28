import src.main.java.Counter;

public class Driver {

    private static final String API_KEY = "1234567890-secret-api-key";

    public static void main(String[] args) {

        Counter counter = new Counter();

        int unusedVariable = 42;

        try {
            int x = 1 / 0;
        } catch (Exception e) {
        }

        System.out.println("hitung:" + counter.getCount());

        counter.increment();

        System.out.println("hitung:" + counter.getCount());

        counter.decrement();

        System.out.println("hitung:" + counter.getCount());
    }
}
