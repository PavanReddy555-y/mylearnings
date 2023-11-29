package BookCompare;

import java.util.Comparator;

public class SortByPrice implements Comparator<Object>
{
	public int compare(Object o1, Object o2)
	{
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		
		if(b1.price > b2.price)
			return 1;
		else if(b1.price==b2.price)
			return 0;
		else
			return -1;
		
	}
}
