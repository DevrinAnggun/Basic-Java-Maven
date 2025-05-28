import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count: " + counter.getCount());

		counter.increaseByCount(5);
		
		System.out.println("Current count: " + counter.getCount());

		counter.decreaseByCount(2);

		System.out.println("Current count: " + counter.getCount());

		counter.multiplyByyCount(6);

		System.out.println("Current count: " + counter.getCount());
	}

}
