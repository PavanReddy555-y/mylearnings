package test;

public class Withdraw implements Transaction
{

	@Override
	public void process(int amt) 
	{
		if(amt<=b.bal)
		{
			System.out.println("withdraw amt:"+amt);
			b.bal=b.bal-amt;
			b.getBalance();
			System.out.println("Transaction completed......");
		}
		else
		{
			System.out.println("Insufficient Amt.......");
		}
		
	}

}
