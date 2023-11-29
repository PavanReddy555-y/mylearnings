package facultyArray;

import java.util.Arrays;
import java.util.Comparator;

public class FacultyDriver {

	public static void main(String[] args) {
		
		Faculty f1 = new Faculty("Danunjaya",65000,"Maths",9133);
		Faculty f2 = new Faculty("Purusottam",56000,"Social",1146);
		Faculty f3 = new Faculty("DD Saheb",55000,"social",3241);
		Faculty f4 = new Faculty("Kaja",70000,"Hindi",8963);
		Faculty f5 = new Faculty("KesavaNayudu",67000,"Workshop",3642);
		Faculty f6 = new Faculty("Naganna",64000,"English",9852);
		Faculty f7 = new Faculty("Rajgopal",70000,"english",1245);
		Faculty f8 = new Faculty("Sreenivaasulu",45000,"basic",4432);
		Faculty f9 = new Faculty("Lakshmi Narayana",80000,"Elementary",7253);
		Faculty f10 = new Faculty("Mahesh",50000,"Engineering",2891);
		
		
		Faculty f[] = {f1,f2,f3,f4,f5,f6,f7,f8,f9,f10};
		
		System.out.println("Before Sorting....");
		for(Faculty fa : f)
		{
			System.out.println(fa);
		}
		
		
		Arrays.sort(f,new FacultySortBySalary());
		System.out.println();
		System.out.println("After Sorting with Salary....");
		for(int i=0; i<f.length; i++)
		{
			System.out.println(f[i]);
		}
		
		Arrays.sort(f,new SortByName());
		System.out.println();
		System.out.println("After Sorting with Name....");
		for(int i=0; i<f.length; i++)
		{
			System.out.println(f[i]);
		}
		
		/*     Lambda Expression    */
		
		Comparator c1 = (Object o1, Object o2)->
		{
			Faculty fc1 = (Faculty) o1;
			Faculty fc2 = (Faculty) o2;

				return fc1.subject.compareTo(fc2.subject);
		};
		
		Arrays.sort(f,c1);
		System.out.println();
		System.out.println("After Sorting with Subject....");
		for(int i=0; i<f.length; i++)
		{
			System.out.println(f[i]);
		}
		
		
		Comparator c2 = (Object o1,Object o2)->
		{
			Faculty fc1 = (Faculty) o1;
			Faculty fc2 = (Faculty) o2; 
			
			if(fc1.empId<fc2.empId)
				return -1;
			else if(fc1.empId==fc2.empId)
				return 0;
			else
				return 1;
			
		};
		
		
		Arrays.sort(f,c2);
		System.out.println();
		System.out.println("After Sorting with Empid....");
		for(int i=0; i<f.length; i++)
		{
			System.out.println(f[i]);
		}
		
	}

}
