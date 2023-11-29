package practiceClass;

public class Book 
{
	String name;
	public Book(String name)
	{
		this.name=name;
	}
	/*public boolean equals(Object o)
	{
		Book b = (Book) o;
		return this.name.equals(b.name);
	}*/
	public static void main(String[] args) 
	{
		Book b = new Book("Topper");
		
		Book b1 = new Book("Topper");
		System.out.println(b==b1);
		System.out.println(b.equals(b1));
	}
}
