import static org.junit.Assert.*;

import org.junit.Test;
public class Wordduptest {
Worddup d1=null;
	@Test
	public void duplicateTest(){
		Worddup d1=new Worddup();
		
		//String s1="madm";
		assertTrue("madm",d1.dup("madam"));
		assertTrue("rahul",d1.dup("raahul"));
	}
	private void assertTrue(String string, StringBuilder dup) {
		
	}
}


