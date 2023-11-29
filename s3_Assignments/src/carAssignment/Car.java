package carAssignment;

public class Car 
{
	private String brand;
	private String name;
	private double price;
	private int yom;
	private String color;
	public Car(String brand,String name,double price,int yom,String color)
	{
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.yom=yom;
		this.color=color;
	}
	
	@Override
	public String toString()
	{
		return "\nBrand :"+ brand +"\nName:"+ name +"\nPrice :"+ price +" \nYear of Manufacturing :"+ yom +
				"\ncolor :"+ color;
	}
	
	/*
	@Override
	public boolean equals(Object o)
	{
		Car c =  (Car)o; 
		return this.brand.equals(c.brand)&& this.name.equals(c.name)&& this.price==c.price &&
				this.yom==c.yom && this.color.equals(c.color);
	}
	@Override
	public int hashCode()
	{
		return brand.hashCode()+name.hashCode()+(int)price+yom+color.hashCode();
	}
	*/
	public String getBrand() {
		return brand;
	}
	public String getName() {
		return name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYom() {
		return yom;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}

	public void setYom(int yom) {
		this.yom = yom;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public boolean equals(Object ob)
	{
		Car c = (Car) ob;
		return c.color.equals(this.color);
	}
	public int hashcode()
	{
		return color.hashCode();
	}
	
	

}
