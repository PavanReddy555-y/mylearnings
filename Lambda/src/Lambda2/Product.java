package Lambda2;

public class Product 
{
	String name;
	double price;
	int offer;
	int prod_id;
	
	public Product()
	{
		
	}
	public Product(String name, double price, int offer, int prod_id) 
	{
		super();
		this.name = name;
		this.price = price;
		this.offer = offer;
		this.prod_id = prod_id;
	}
	@Override
	public String toString() {
		return "["+"name= " + name + ", price= " + price + ", offer= " + offer + ", prod_id= " + prod_id+"]" ;
	}
	
	
	
	
}
