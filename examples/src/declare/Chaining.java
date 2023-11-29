package declare;

public class Chaining 
{
	int i;
	String s;
	public Chaining(int i)
	{
		this("Pavan");
		this.i=i;
	}
	public Chaining()
	{
		this(21);
	}
	public Chaining(String s)
	{
		this.s=s;
	}

	public static void main(String[] args)
	{
		Chaining c = new Chaining();
		System.out.println(c.i);
		System.out.println(c.s);
	}

}
