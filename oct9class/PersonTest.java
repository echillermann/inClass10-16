package oct9class;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		try
		{
			String firstName = "";
			String lastName = "Smith";
			Person x = new Person(firstName, lastName);
			fail("Not yet implemented");
		}
		catch(NameException e)
		{
			
			
		}
	}
	
	@Test
	public void constructorGoodTest() {
		try
		{
			String firstName = "Bo";
			String lastName = "Smith";
			Person x = new Person(firstName, lastName);
		}
		catch(NameException e)
		{
			fail("Not yet implemented");
		}
	}

	@Test
	public void describeSelfTest() {
		try
		{
			String firstName = "Bo";
			String lastName = "Smith";
			Person x = new Person(firstName, lastName);
			
			String expected = "*** First Name: " + firstName + " Last Name: " + lastName + "***";
			String actual = x.describeSelf();
			assertEquals(expected, actual);
		}
		catch(NameException e)
		{
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void constructorOrderTest() {
		try
		{
			String firstName = "Bo";
			String lastName = "Smith";
			Person x = new Person(firstName, lastName);
			
			String expected = "*** First Name: " + firstName + " Last Name: " + lastName + "***";
			String actual = x.describeSelf();
			assertEquals(expected, actual);
		}
		catch(NameException e)
		{
			fail("Not yet implemented");
		}
	}
}
