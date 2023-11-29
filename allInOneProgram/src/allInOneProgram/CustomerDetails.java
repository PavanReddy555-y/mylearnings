package allInOneProgram;

public class CustomerDetails extends Bank
{
	private long accNo;
	private double balance;
	private String name;
	
	@Override
	public void accStatus()
	{
		System.out.println("Customer  Account is in Active ......");
	}
	public void setAccNo(long accNo)
	{
		this.accNo=accNo;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public long getAccNo()
	{
		return accNo;
	}
	public double getBalance()
	{
		return balance;
	}
	public String getName()
	{
		return name;
	}
}
