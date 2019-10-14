package oct9class;

public class Student extends Person implements Comparable<Student>
{
	private Integer rating;
	private String className;

	public Student() throws NameException
	{
		super();
	}
	
	public Student(String firstName, String lastName) throws NameException
	{
		super(firstName, lastName);
	}
	
	public Student(String firstName, String lastName, int rating) throws NameException
	{
		super(firstName, lastName);
		this.rating = rating;
	}
	
	public int compareTo(Student o)
	{
		
		return 0;
	}
}
