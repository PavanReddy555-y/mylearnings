package s7_Interface1_DefaultMethod;

public interface PulserBike {

	default String feature() {
		return "Speed";
	}
}
