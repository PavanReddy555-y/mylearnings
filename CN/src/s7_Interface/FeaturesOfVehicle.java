package s7_Interface;

public class FeaturesOfVehicle {
	public static void main(String[] args) {
		
		Vehicle.function();// static method call
		
		Vehicle vehicle = new TwoWheeler();
		System.out.println("------Two Wheeler Details-----");
		
		vehicle.speed();
		vehicle.fuelType();
		vehicle.brakeType();
		vehicle.color();
		
		
		TwoWheeler twoWheel = (TwoWheeler) vehicle;
		twoWheel.speed();
		twoWheel.price();
		System.out.println("--------------------------------");
		
		Vehicle vehicle2 = new ThreeWheeler();
		System.out.println("------Three Wheeler Details-----");
		
		vehicle2.speed();
		vehicle2.fuelType();
		vehicle2.brakeType();
		vehicle2.color();
		
		
		ThreeWheeler threeWhee = (ThreeWheeler) vehicle2;
		threeWhee.speed();
		threeWhee.price();
		vehicle2.get();
		
		System.out.println("--------------------------------");
		
		Vehicle vehicle3 = new FourWheeler();
		System.out.println("-----Four Wheeler Details-----");
		
		vehicle3.speed();
		vehicle3.fuelType();
		vehicle3.brakeType();
		vehicle3.color();
		
		
		
		FourWheeler FourWheel = (FourWheeler) vehicle3;
		FourWheel.speed();
		FourWheel.price();
		
	}

	
}
