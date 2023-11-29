package s11_15_2_Generics;

import java.util.ArrayList;
import java.util.List;

import s5.AccessModifiers.Employee;

public class GenericMain {

	public static  void main(String[] args) {
		MyGeneric<String> generic = new MyGeneric<>();
		generic.setName("Pavan");
		
		MyGeneric<String> generic1 = new MyGeneric<>();
		generic1.setName("Pavan");
		
		MyGeneric<Integer> generic2 = new MyGeneric<>();
		generic2.setName(123);
		
		
		System.out.println(generic.getName());
		System.out.println(generic1.getName());
		System.out.println(generic2.getName());
		
		
		System.out.println(MyGeneric.isEqual(generic.getName(),generic1.getName()));
		
		System.out.println(generic);
		
		
		
		
		Employee e1 = new Employee();
		
		e1.setName("Pavan Star...");
		
		
		Employee e2 = new Employee();
		
		e2.setName("Chiru ...");
		
		List<Employee> l1 = new ArrayList<>();
		l1.add(e2);
		l1.add(e1);
		
		Display d = new Display();
		
		//d.display(l1);
		
		
		
		
	}

}
