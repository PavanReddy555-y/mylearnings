package facultyArray;

import java.util.Comparator;

public class FacultySortBySalary implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		Faculty f1 = (Faculty) o1;
		Faculty f2 = (Faculty) o2;
		if(f1.salary < f2.salary)
			return -1;
		else if (f1.salary == f2.salary)
			return 0;
		else
			return 1;
	}

}
