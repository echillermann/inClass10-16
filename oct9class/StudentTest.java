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
	public void testStudentStringStringInt()
	{
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
	public void testSetRating()
	{
		try
		{
			Student s = new Student();
			Integer expected = 4;
			s.setRating(expected);
			Integer actual = s.getRating();
			assertEquals(expected, actual);
		}
		catch(NameException e)
		{
			fail();
		}
	}

	@Test
	public void testCompareTo() throws NameException {
		Student first = new Student("z","z",4);
		Student second = new Student("v","v",2);
		Student third = new Student("c","c",4);
		
		int actual = first.compareTo(second);
		int expected = 1;
		assertEquals(expected,actual);
		
		actual = second.compareTo(first);
		expected = -1;
		assertEquals(expected,actual);
		
		actual = first.compareTo(third);
		expected = 0;
		assertEquals(actual,expected);
		
	}

}
