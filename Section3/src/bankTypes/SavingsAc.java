package bankTypes;

public class SavingsAc extends Account
{
	private double balance;
	
	
	public SavingsAc(long accNo, String name, int ifscCode, double balance) {
		super(accNo, name, ifscCode);
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void displayBalance()
	{
		System.out.println(balance);
	}
	
	public String toString()
	{
		return balance+" ";
	}
	public boolean equals( Object obj)
	{
		SavingsAc sv = (SavingsAc) obj;
		return this.balance==sv.balance;
	}
	public int hashCode()
	{
		return (int)balance;
	}
}
