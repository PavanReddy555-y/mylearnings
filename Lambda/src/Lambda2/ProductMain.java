package Lambda2;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Product> al = new LinkedList<>();
		
		Product p1 = new Product("Laptop",35000,15,21);
		Product p2 = new Product("Mobile",20000,10,50);
		Product p3 = new Product("Watch",3999,5,9);
		Product p4 = new Product("Ac",22999,50,1);
		Product p5 = new Product("Tv",14659,12,3);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
	
		
		Comparator comparebyPrice = (o1,o2)->
		{
			Product pp1 = (Product)o1;
			Product pp2 = (Product)o2; 
			if(pp1.price>pp2.price)
				return 1;
			else if(pp1==pp2)
				return 0;
			else
				return -1;
		};
		
		Comparator CompByName =(o1,o2)->
		{
			Product pp1 = (Product)o1;
			Product pp2 = (Product)o2;
			return pp1.name.compareTo(pp2.name);
		};
		
		Comparator compByOffer = (o1,o2)->
		{
			Product pp1 = (Product)o1;
			Product pp2 = (Product)o2;
			
			if(pp1.offer>pp2.offer)
				return 1;
			else if(pp1.offer==pp2.offer)
				return 0;
			else 
				return -1;
		};
		System.out.println();
		System.out.println("Before Sorting.........");
		for(Product p : al)
		{
			System.out.println(p);
		}
		
		
		System.out.println("1.Sort According to Name");
		System.out.println("2.Sort According to Price");
		System.out.println("3.Sort According to Offer");
		System.out.println("Enter the choice.....");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				Collections.sort(al,CompByName);
				System.out.println();
				System.out.println("Sorted by Name.....");
				for(Product p : al)
				{
					System.out.println(p);
				}
				
			}break;
			case 2 :
			{
				Collections.sort(al,comparebyPrice);
				System.out.println();
				System.out.println("Sorted by Price.....");
				for(Product p : al)
				{
					System.out.println(p);
				}
			}break;
			case 3:
			{
				Collections.sort(al,compByOffer);
				System.out.println("Sorted by Offer......");
				System.out.println();
				for(Product p : al)
				{
					System.out.println(p);
				}
				
			}break;
			default :
				System.out.println("Invalid iput..........");
				
		}
		
		

		
		
		
		
		
		

		
		sc.close();
	}

}
