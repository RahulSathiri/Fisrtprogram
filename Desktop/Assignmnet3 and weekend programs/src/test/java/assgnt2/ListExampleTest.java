package assgnt2;

import static org.junit.Assert.*;

import org.junit.Test;

import sourcecode.ListExample;

public class ListExampleTest {

	/*ListExample le;
	@Before
	public void setUp()
	{
		le=new ListExample(13);
	}*/
	@Test
	public void getIndexOfTest() 
	{
	ListExample le=new ListExample(13);
     le.add(5);
    int result=le.getIndexOf(5);
    assertEquals(0,result);
    }
	@Test
	public void getTest() 
	{
		ListExample le=new ListExample(13);
        le.add(5);
        Object result=le.get(0);
        assertEquals(5,result);
    }
	@Test
	public void containsTest() 
	{
		ListExample le=new ListExample(13);
        le.add(5);
        boolean result=le.contains(5);
        assertEquals(true,result);
    }
	@Test
	public void sizeTest() 
	{
		ListExample le=new ListExample(13);
        le.add(5);
        int result=le.size();
        assertEquals(1,result);
    }
	@Test
	public void isEmptyTest() 
	{
		ListExample le=new ListExample(13);
        //le.add(5);
        boolean result=le.isEmpty();
        assertEquals(true,result);
    }
	@Test
	public void displayTest() 
	{
		ListExample le=new ListExample(13);
        le.add(5);
        le.add("hi");
        le.delete("hi");
        le.add('h');
        String result=le.display();
        assertEquals("[5,h,]",result);
    }

}
