package BookCompare;

public class Book  {

	int id;
	String title;
	double price;
	String author;
	public Book(int id, String title, double price, String author) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	

	public String toString()
	{
		return " Book Id : "+ id + " BOOk title : "+ title+ " Book Price : "+ price + " Book Author : "+ author;
	}


	
	
	
	
}
