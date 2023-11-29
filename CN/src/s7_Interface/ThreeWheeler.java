package s7_Interface;

public class ThreeWheeler implements Vehicle {
	
	@Override
	public void speed() {
	System.out.println("Speed Range from 0 to 80 Kmph");
		
	}
	
	@Override
	public void brakeType() {
		System.out.println("Brake Type was Drum Type ");
		
	}

	@Override
	public void fuelType() {
		System.out.println("Desiel");
		
	}

	@Override
	public void color() {
		System.out.println("Color varies according to User Requirement maximum in green and yellow.");
		
	}
	
	public void seatingCapacity()
	{
		System.out.println("Capacity in three wheeler is  4 to 8");
	}
	public void price()
	{
		System.out.println("Price varies based on Model of the two wheeler..from 400000 to 800000");
	}

	
}
