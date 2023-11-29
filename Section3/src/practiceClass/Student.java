package practiceClass;

public class Student 
{
	int id;
	String sname;
	public Student(int id , String sname)
	{
		//super();
		this.id=id;
		this.sname=sname;
	}
	public String toString()
	{
		  
		return " id : " + id + "  Sname : "+sname;
	}
	public static void main(String[] args) 
	{
		Student s = new Student(420,"Lala");
		System.out.println(s);
	}
}
