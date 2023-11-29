package allInOneProgram;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainBank {

	public static void main(String[] args)  
	{
		/*
		Bank b = new CustomerDetails();
		b.accStatus();
		CustomerDetails c = (CustomerDetails) b;
		c.setAccNo(919133082600l);
		c.setBalance(91660.5d);
		c.setName("Pavan");
		System.out.println(c.getAccNo());
		System.out.println(c.getBalance());
		System.out.println(c.getName());
		c.accStatus();
		*/
			Parent p = new Child();
		
			p.practice(1);
		

	}

}
class Parent{
	Parent practice(int i) {
		System.out.println("Parent class");
		return new Child();
	}
}
class Child  extends Parent{
	@Override
	Child practice(int d)  {
		System.out.println(10/0);
		System.out.println("Child class");
		return new Child();
	}
}
