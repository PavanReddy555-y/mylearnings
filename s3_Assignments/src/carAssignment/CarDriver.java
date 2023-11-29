package carAssignment;

import java.util.ArrayList;

public class CarDriver {

	public static void main(String[] args) 
	{
		ArrayList<Car> al = new ArrayList<>();
		
		
		Car c1 = new Car("Mahindra", "XUV700",25000,1947,"black");
		
		Car c2 = new Car("Maruthi","Swift",12000,1999,"red");
		 
		Car c3 = new Car("BMW","bmw",20000,2000,"blue");
		
		Car c4 = new Car("Maruthi","baleno",25000,2002,"black");
		
		Car c5 = new Car("Audi","audi",30000,2004,"Yellow");
		
		
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		System.out.println(al);
		
		
		for(Object obj : al)
		{
			Car ca = (Car) obj;
			String calr =ca.getColor();
			if(calr.equals("black"))
			{
				System.out.println(ca);
			}
			
		}
	}

}
