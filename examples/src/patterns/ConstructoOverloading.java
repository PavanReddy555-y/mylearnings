package patterns;

public class ConstructoOverloading 
{
	int id;
	 String name;
	 
	 long phno;
	public ConstructoOverloading(int id)
	{
		this(9603206991l);
		this.id=id;
		
	}
	public ConstructoOverloading(String name)
	{
		this.name=name;
	}
	public ConstructoOverloading(long phno)
	{
		this("pavan");
		this.phno=phno;
		
	}
	
	public static void main(String[] args) 
	{
		ConstructoOverloading a = new ConstructoOverloading(16176);
				System.out.println(a.id);
				System.out.println(a.name);
				System.out.println(a.phno);
	}
}
