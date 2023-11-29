package bookAssignment;

public class Book 
{
	private String bName;
	private int bid;
	private String author;
	private double price;
	
	
	public Book(String bName, int bid, String author, double price) {
		super();
		this.bName = bName;
		this.bid = bid;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Book Name : "+bName + "  , Book Id : "+ bid + " , Author : "+author +" , Price :"+price+ "\n";
	}
	/*
	@Override
	public boolean equals(Object o)
	{
		Book b = (Book) o;
		return this.bName.equals(b.bName)&&this.bid==b.bid && this.author.equals(b.author)&&
				this.price==b.price;
	}
	@Override
	public int hashCode()
	{
		return bName.hashCode()+bid+author.hashCode()+(int)price;
	}
	
	*/
	public String getbName() {
		return bName;
	}

	public int getBid() {
		return bid;
	}
	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}
	/*
	public void setbName(String bName) {
		this.bName = bName;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	*/
	
	public boolean equals(Object o)
	{
		Book b = (Book) o;
		return this.bName.equals(b.bName);
	}
	public int hashCode()
	{
		return bName.hashCode();
	}
	



	
	
	
	
}
