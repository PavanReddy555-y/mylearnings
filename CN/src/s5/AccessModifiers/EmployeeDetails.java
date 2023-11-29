package s5.AccessModifiers;

public class EmployeeDetails extends Employee{
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Pavan");
		emp.setLocation("Hyderabad");
		emp.setDesignatio("Developer");
		
		
		System.out.println(emp.getName());
		System.out.println(emp.getLocation());
		System.out.println(emp.getDesignatio());
		
		System.out.println(emp);/* if when we call object 
		reference then must toString() in Employee class 
		then only we can able to get states of an object 
		otherwise we will get address of an objext*/
		
	}

}
