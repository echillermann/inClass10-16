package oct9class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class driver {
	public static void main(String[] args) throws NameException
	{
		Object[] ar = new Object[10];
		try
		{
			Student s1 = new Student("Alex", "", 3);
			Student s2 = new Student("Spooky", "M", 4);
			Student s3 = new Student("X","Y",5);
			NameHolder bo = new Student("Bo","O",2);
			((Student)bo).setRating(3);
		
			ar[0] = 2;
			ar[1] = s1;
			ar[2] = "aha";
			ar[3] = s2;
			ar[4] = s3;
			ar[5] = bo;
			
			for(Object o: ar)
			{
				System.out.println(o);
			}
			
			List<Student> students = new LinkedList<>(); //List<Student sx = new ArrayList<>();
			students.add(s1);//arrayList size starts as 0, then goes to 10 when an object is added, then adds 5
			students.add(s2);//linkedList adds one to size for every object
			students.add(s3);//can repeat elements in list
			students.add((Student)bo);
			
			Map<String, Student> m = new HashMap<>(); //canNOT repeat elements in map, cannot repeat keys
			Integer index = 0;
			for(Student s: students)
			{
				m.put("s1" + index++, s);
				System.out.println(s);
			}
			
		}
		catch(NameException e)
		{
			e.printStackTrace();
		}
	}
}
