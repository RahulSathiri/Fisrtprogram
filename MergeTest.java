import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MergeTest {

	@Test
	public void test() {
		MergeArray m1=new MergeArray();
				ArrayList<Integer>r=new ArrayList<Integer>();
		ArrayList<Integer> result=m1.merge(new int[]{2,4,5,9},new int[]{3,6,7,8});
		r.add(2);
		r.add(3);
		r.add(4);
		r.add(5);
		r.add(6);
		r.add(7);
		r.add(8);
		r.add(9);
		assertEquals(r,result); 
		
		
	}
	}


