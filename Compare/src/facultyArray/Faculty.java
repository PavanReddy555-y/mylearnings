package facultyArray;

public class Faculty 
{

	String name;
	double salary;
	String subject;
	int empId;
	
	
	public Faculty(String name, double salary, String subject, int empId) {
		super();
		this.name = name;
		this.salary = salary;
		this.subject = subject;
		this.empId = empId;
	}


	@Override
	public String toString()
	{
		return " Faculty Name : "+name+"  Faculty salary : "+ salary + "  Subject : "+subject+"  empId :"+empId;
	}



	
	
	
	
	
}
