import static org.junit.Assert.*;

import org.junit.Test;

public class Swaptest {

	@Test
	public void testSwap() {
		Swap test= new Swap();
		int[] output = test.swapnum1(2,3);
		assertEquals(3,output[0]);
		assertEquals(2,output[1]);
	}


	
		
	}


