package s7_Interface;

public interface Vehicle {

	void speed();
	void brakeType();
	void fuelType();
	void color();
	
	default void get()
	{
		System.out.println("When we drive anything under controle there is no issue");
	}
	
	static void function()
	{
		System.out.println("Nothing is permanent.......");
	}
}
