package exceptions;

import java.io.FileNotFoundException;

@SuppressWarnings("serial")
public class InsufficientFundsException extends FileNotFoundException
{
	public void message()
	{
		System.out.println("Ammount Entered is higher "
				+ "than the limit balance in u r account");
	}
}
