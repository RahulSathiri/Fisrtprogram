import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Missingnumberarraytest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] output = Missingnumberarray.Findnumber(new int []{1,3,5});
		assertArrayEquals(new int[] {2,4,0,0,0}, output);
		
	}
	}


