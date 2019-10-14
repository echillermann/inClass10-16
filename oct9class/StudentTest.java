package oct9class;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	public static final int INITIAL_RATING = 0;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStudent() 
	{
		try{
			Student s = new Student();
			Integer rating = s.getRating();
			Integer expected = INITIAL_RATING;
			assertEquals(expected, rating);
		}
		catch(NameException e)
		{
			fail();
		}
	}

	@Test
	public void testStudentStringString()
	{
		try
		{
			Student t = new Student("Bob","Alex");
			Integer rating = t.getRating();
			Integer expected = INITIAL_RATING;
			assertEquals(expected, rating);
		}
		catch(NameException e)
		{
			fail();
		}
	}

	@Test
	public void testStudentStringStringInt() {
		try
		{
			Student t = new Student("Bob","Alex",4);
			Integer rating = t.getRating();
			Integer expected = 4;
			assertEquals(expected, rating);
		}
		catch(NameException e)
		{
			fail();
		}
	}

	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

}
