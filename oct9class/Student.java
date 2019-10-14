package oct9class;

public class Student extends Person implements Comparable<Student>
{
	private Integer rating;
	private String className;
	public static final int INITIAL_RATING = 0;


	public Student() throws NameException
	{
		super();
		rating = INITIAL_RATING;
	}
	
	public Student(String firstName, String lastName) throws NameException
	{
		super(firstName, lastName);
		rating = INITIAL_RATING;
	}
	
	public Student(String firstName, String lastName, int rating) throws NameException
	{
		super(firstName, lastName);
		this.rating = rating;
	}
	
	public Integer getRating()
	{
		return rating;
	}
	
	public int compareTo(Student o)
	{
		
		return 0;
	}
}
