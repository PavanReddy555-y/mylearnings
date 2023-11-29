package s7_Interface;

public class TwoWheeler implements Vehicle {

	@Override
	public void speed() {
	System.out.println("Speed Range from 0 to 120 Kmph");
		
	}

	@Override
	public void brakeType() {
		System.out.println("Brake Type was ");
		
	}

	@Override
	public void fuelType() {
		System.out.println("Petrole");
		
	}

	@Override
	public void color() {
		System.out.println("Color varies according to User Requirement.");
		
	}
	
	public void seatingCapacity()
	{
		System.out.println("Capacity in two wheeler is 2");
	}
	public void price()
	{
		System.out.println("Price varies based on Model of the two wheeler..from 70000 to 800000");
	}

}
