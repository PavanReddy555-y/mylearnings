package facultyArray;
import java.util.Comparator;
public class SortByName implements Comparator<Object>
{
	@Override
	public int compare(Object o1,Object o2)
	{
		Faculty f1 = (Faculty)o1;
		Faculty f2 = (Faculty)o2;
		
		return f1.name.compareTo(f2.name);
		
	}
}
