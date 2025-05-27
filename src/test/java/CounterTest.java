import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CounterTest {
    private Counter counter;

    @Before
    public void setUp() {
        counter = new Counter();
    }

    @Test
    public void testReset() {
        counter.increment();
        counter.increment();
        assertEquals(2, counter.getCount());
        counter.reset();
        assertEquals(0, counter.getCount());
    }

    @Test
    public void testIncrement() {
        counter.increment();
        counter.increment();
        assertEquals(2, counter.getCount());
    }

    @Test
    public void testDecrement() {
        counter.increment();
        counter.increment();
        counter.decrement();
        assertEquals(1, counter.getCount());
    }
}