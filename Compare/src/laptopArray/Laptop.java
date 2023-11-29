package laptopArray;

public class Laptop implements Comparable<Object>
{
	double price;
	int id;
	String brand;
	
	public Laptop(double price, int id, String brand) {
		super();
		this.price = price;
		this.id = id;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Price :"+ price + " Laptop Id :"+ id + " Brand :"+ brand;
	}
	@Override
	public int compareTo(Object o) {
		Laptop lp = (Laptop)o;
		if(this.id<lp.id)
			return 1;//descending order
		//return -1;// ascending order
		
		else if(this.id==lp.id)
			return 0;
		else
			return -1;//Descending order
			//return  1;// ascending order
		
	}
}
