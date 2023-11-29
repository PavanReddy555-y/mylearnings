package abstract_bank;

public class CusDetails extends Bank
{
	private long accNo;
	private double accBalance;
	private String name;
	public void setAccNo(long accNo)
	{
		this.accNo=accNo;
	}
	public void setAccBalance(double accBalance)
	{
		this.accBalance=accBalance;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public long getAccNo()
	{
		return accNo;
	}
	public double getAccBalance()
	{
		return accBalance;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public void idValidate() 
	{
		System.out.println("id validation Sccessfull");
		
	}

	@Override
	void accStatus() 
	{
		System.out.println("Account Status : Account in active");
	}

}
