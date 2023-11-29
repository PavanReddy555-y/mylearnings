package s6_CastingAbdtractInterface;

public class FixedDepositAccount extends Account {

	@Override
	public double interst(int amount, double rate, int time) {
		double intrestValue=(amount*rate*time)/100;
		
		//System.out.println("Fixed Deposit Account Intrest : "+intrestValue);
		return intrestValue;
		
	}

}
