package assgnt2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sourcecode.Stack;

public class StackTest {
	
	@Test
	public void isEmptyTest() {
		Stack s=new Stack(10);
		s.push('i');
		boolean result=s.isEmpty();
		assertEquals(false,result);
		
	}
	@Test
	public void popTest() {
		Stack s=new Stack(10);
		s.push('i');
		s.push('f');
		Object result=s.pop();
		assertEquals('f',result);
		
	}
	@Test
	public void displayTest() {
		Stack s=new Stack(10);
		s.push('i');
		s.push('f');
		String result=s.display();
		assertEquals("[f,i,]",result);
		
	}
	@Test
	public void sizeTest() {
		Stack s=new Stack(13);
		int result=s.size();
		assertEquals(13,result);
		
	}

		
	}


