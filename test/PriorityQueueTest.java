import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

	/*
	 * Part 1: complete
	 */
	
	PriorityQueue pq;
	
	@Before
	public void setup(){
		pq = new PriorityQueue(20);
	}
	
	@Test
	public void insertTestMin() {
		// insert a few numbers then test pq.min()
		pq.insert(1);
		pq.insert(2);
		pq.insert(3);
		assertTrue(pq.min() == 1);
	}
	
	@Test
	public void insertTestSize() {
		// insert a few numbers then test pq.size()
		pq.insert(1);
		pq.insert(2);
		pq.insert(3);
		assertTrue(pq.size() == 3);
	}

	@Test
	public void removeMinTest() {
		// step 1: add a few numbers to pq
		pq.insert(1);
		pq.insert(2);
		pq.insert(3);
		// step 2: call pq.removeMin() a few times to check
		//         numbers are returned in ascending order 
		assertTrue(pq.removeMin() == 1);
		assertTrue(pq.removeMin() == 2);
	}
	
	
	@Test(expected=PriorityQueueException.class)
	public void removeMinEmptyTest() {
		pq.removeMin();
	}
}	
