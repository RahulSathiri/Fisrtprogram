import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Primefacttest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<Integer> output = Primefact.primeFactors(20);
		
		assertArrayEquals(new int[] {2, 2, 5}, output);
	}

	private void assertArrayEquals(int[] is, List<Integer> output) {
		// TODO Auto-generated method stub
		
	}



}
