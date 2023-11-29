package bankTypes;

public class LoanAc extends Account
{
	private double loanAmt;

	public LoanAc(long accNo, String name, int ifscCode, double loanAmt) {
		super(accNo, name, ifscCode);
		this.loanAmt = loanAmt;
	}

	public double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}
	public void displayLoan()
	{
		System.out.println(loanAmt);
	}
	
	public String toString()
	{
		return loanAmt+" ";
	}
	public boolean equals( Object ob)
	{
		LoanAc la = (LoanAc) ob;
		return this.loanAmt==la.loanAmt;
	}
	public int hashCode()
	{
		return (int)loanAmt;
	}
	
}
