package practiceClass;

public class Rectangle 
{
private double  height =75;
private double breadth=100;

	public Rectangle(double height, double breadth)
	{
		this.height=height;
		this.breadth=breadth;
	}
	
		public void setHeight( double height)
		{
			this.height=height;
		}
		public void setBreadth( double breadth)
		{
			this.breadth=breadth;
		}
		public double getHeight()
		{
			return height;
		}
		public double getBreeadth()
		{
			return breadth;
		}
		public double areaOfRect()
		{
			return height*breadth;
		}
		@Override
		public String toString() 
		{
			return "areaOfRect:"+height*breadth;
		}
		@Override
		public boolean equals( Object o)
		{
			Rectangle r3= (Rectangle ) o;
			return this.breadth==r3.breadth && this.height==r3.height;
		}
		public int hashCode()
		{
			return (int)breadth+(int)height;
		}
		
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(75,100);
		Rectangle re = new Rectangle(75,100);
		System.out.println(r.areaOfRect());
		System.out.println(r);
		
		System.out.println("==================");
		System.out.println(r==re);
		System.out.println(r.equals(re));
		System.out.println("==================");
		System.out.println(r.hashCode()==re.hashCode());
	}

}
