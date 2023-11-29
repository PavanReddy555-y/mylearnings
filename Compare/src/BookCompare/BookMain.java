package BookCompare;

import java.util.Arrays;
import java.util.Comparator;

public class BookMain {

	public static void main(String[] args) {
		
		Book b1 = new Book(109,"Java",2500,"PoojaMam" );
		Book b2 = new Book(105,"SQL",3000,"UMA Shankar" );
		Book b3 = new Book(119,"WEB",2546,"Salaman Sir" );
		Book b4 = new Book(132,"Maths",1424,"Danunjaya Sir " );
		Book b5 = new Book(101,"Social",5000,"DD Saheb Sir" );
		
		Book b [] = {b1,b2,b3,b4,b5};
		
		System.out.println("Before Sorting.....");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		
		/* Lambda Function */
		Comparator c1 = (Object o1, Object o2)->
		{
			Book bk1 = (Book) o1;
			Book bk2 = (Book) o2;
			
			if(bk1.id<bk2.id)
				return -1;
			else if(bk1.id==bk2.id)
				return 0;
			else 
				return 1;
			
		};
		Comparator c2 = (Object o1, Object o2)->
		{
			Book bk1 = (Book) o1;
			Book bk2 = (Book) o2;
			
			return bk1.title.compareTo(bk2.title);
			
		};
		
		
		Arrays.sort(b,c1);
		System.out.println("\nAfter Sorting  array by Id.....");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		Arrays.sort(b,c2);
		System.out.println("\nAfter Sorting  array by title.....");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		Arrays.sort(b,new SortByPrice());
		System.out.println("\nAfter Sorting  array by Price.....");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		Arrays.sort(b,new SortByAuthorName());
		System.out.println("\n After Sorting  array by Author Name.....");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
	}
}
