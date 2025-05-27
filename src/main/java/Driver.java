import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("hitung:" + counter.getCount());
		
		counter.increaseBy(5);
		
		System.out.println("hitung:" + counter.getCount());
		
		counter.decreaseBy(2);
		
		System.out.println("hitung:" + counter.getCount());
		
	}

}
