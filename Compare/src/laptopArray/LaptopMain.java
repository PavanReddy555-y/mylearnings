package laptopArray;
import java.util.*;
public class LaptopMain 
{
	public static void main(String[] args) 
	{
		Laptop l1 = new Laptop(26789,2134,"Lenova");
		Laptop l2 = new Laptop(35000,9133,"HP");
		Laptop l3 = new Laptop(42000,4632,"Apple");
		Laptop l4 = new Laptop(17000,2255,"Dell");
		Laptop l5 = new Laptop(56000,4562,"LG");
		
		Laptop [] l = {l1,l2,l3,l4,l5};
		
		System.out.println();
		System.out.println("Before Sorting\n");
		for(Laptop lp :l)
		{
			System.out.println(lp);
		}
		
		Arrays.sort(l); 
		
		System.out.println();
		System.out.println("After Sorting\n");
		for(Laptop lp :l)
		{
			System.out.println(lp);
		}
	}
}
