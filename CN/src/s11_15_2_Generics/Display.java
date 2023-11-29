package s11_15_2_Generics;

import java.util.List;

public class Display {
	
	
	public void display(List<Student> objects)
	{
		for(Object o: objects)
		{
			Student s = (Student)o;
			
			
			System.out.println(s.getName());
		}
		
		
	}

}
