package oct9class;

import java.util.Comparator;

public class CompareLastFirstName implements Comparator<Student>
{
	public int compare(Student first, Student second)
	{
		String firstName1 = first.getFirstName();
		String lastName1 = first.getLastName();
		String firstName2 = second.getFirstName();
		String lastName2 = second.getLastName();
		
		if(firstName1.compareTo(firstName2) < 0)
			return -1;
		else if (firstName1.compareTo(firstName2) > 0)
			return 1;
		else
		{
			if(lastName1.compareTo(lastName2) < 0)
				return -1;
			else if(lastName1.compareTo(lastName2) > 0)
				return 1;
			else
				return 0;
		}
		
	}
}
