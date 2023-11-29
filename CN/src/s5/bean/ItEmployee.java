package s5.bean;

import s5.AccessModifiers.Employee;
import s5.AccessModifiers.EmployeeDetails;

public class ItEmployee {

	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		
		emp.setName("Pavan");
		emp.setLocation("Hyderabad");
		emp.setDesignatio("Developer");
		
		
		System.out.println(emp.getName());
		System.out.println(emp.getLocation());
		System.out.println(emp.getDesignatio());

	}

}
