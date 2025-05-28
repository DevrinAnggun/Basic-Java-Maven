import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		String password = "admin123";

		Counter counter = new Counter();

		System.out.println("hitung:" + counter.getCount());

		counter.increment();

		System.out.println("hitung:" + counter.getCount());

		counter.decrement();

		System.out.println("hitung:" + counter.getCount());

		throw new RuntimeException("Ini error yang disengaja untuk tugas Continuous Inspection");

		System.out.println("Ini tidak akan pernah muncul");
	}
}
