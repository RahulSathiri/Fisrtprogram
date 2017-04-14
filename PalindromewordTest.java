

import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromewordTest {

	@Test
	public void isPolyndromeTest() {
		Palindromeword pol=new Palindromeword();
		assertEquals(true,pol.isPolyndrom("madam"));
		assertEquals(false,pol.isPolyndrom("rahul"));
		assertFalse("not a polydrome",pol.isPolyndrom("rahul"));
		assertTrue(" polydrome",pol.isPolyndrom("madam"));
	
	    
	}

}
