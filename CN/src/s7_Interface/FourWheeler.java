package s7_Interface;

public class FourWheeler implements Vehicle {
	
	@Override
	public void speed() {
	System.out.println("Speed Range from 0 to 400 Kmph");
		
	}
	
	@Override
	public void brakeType() {
		System.out.println("Brake Type was Disc Type ");
		
	}

	@Override
	public void fuelType() {
		System.out.println("Desiel as well as Petrole");
		
	}

	@Override
	public void color() {
		System.out.println("Color varies according to User Requirement .");
		
	}
	
	public void seatingCapacity()
	{
		System.out.println("Capacity in three wheeler is  4 to 7");
	}
	public void price()
	{
		System.out.println("Price varies based on Model of the Four wheeler..from 1000000 to 10000000");
	}

}
