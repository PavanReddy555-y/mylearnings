 package customException2;

import java.io.FileNotFoundException;

public class InvalidAgeException extends FileNotFoundException {
	public void message()
	{
		System.out.println("Age is not eligible....");
	}

}
