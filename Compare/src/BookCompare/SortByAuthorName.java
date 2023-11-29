package BookCompare;

import java.util.Comparator;

public class SortByAuthorName implements Comparator <Book> // if <Book> is not there
{
	public int compare(Book o1, Book o2)   // if <Book> is not there compare (Object o1 , Object o2)
	{
		//Book b1 = (Book)o1;    //if <Book> is not there uncomment
		//Book b2 = (Book)o2;	//if <Book> is not there uncomment
		
		return o1.author.compareTo(o2.author); // if <Book> is not there  return b1.author.compareTo(b2.author);
		
	}


}
