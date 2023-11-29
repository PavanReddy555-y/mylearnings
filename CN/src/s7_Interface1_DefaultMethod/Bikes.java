package s7_Interface1_DefaultMethod;

public class Bikes implements HondaBike, PulserBike {

	@Override
	public String feature() {
		
		System.out.println(HondaBike.super.feature());
		System.out.println(PulserBike.super.feature());
		
		
		return "all is well";
	}

	
	
	public static void main(String[] args) {
		
		/*
		PulserBike  p = new Bikes();
		System.out.println(p.feature());
		
		HondaBike hb = new Bikes();
		System.out.println(hb.feature());
		*/
		
		Bikes b = new Bikes();
		System.out.println(b.feature());
		

	}

}
