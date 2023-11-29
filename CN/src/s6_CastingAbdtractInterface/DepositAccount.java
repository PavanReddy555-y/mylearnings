package s6_CastingAbdtractInterface;

public class DepositAccount extends Account {

	@Override
	public double interst(int amount, double rate, int time ) {
		double intrestValue=(amount*rate*time)/100;
		
		//System.out.println("Deposit Account Intrest : "+intrestValue);
		return intrestValue;
	}
	
	@Override
	 public void allInOne()
	 {
		 System.out.println("In DepositAccount");
	 }
}
