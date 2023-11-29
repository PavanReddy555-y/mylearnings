package test;

public class Deposite implements Transaction
{
	public void process(int amt)
	{
		System.out.println("Deposited amt"+amt);
		b.bal=b.bal+amt;
		b.getBalance();
		System.out.println("Transaction completed......");
	}
}
