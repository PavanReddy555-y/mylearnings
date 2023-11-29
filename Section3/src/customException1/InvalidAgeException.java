package customException1;

public class InvalidAgeException extends ArithmeticException {
	
	public void message()
	{
		System.out.println("Age is not Eligible.....");
	}
}
