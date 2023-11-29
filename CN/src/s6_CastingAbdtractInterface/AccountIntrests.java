package s6_CastingAbdtractInterface;

public class AccountIntrests {

	public static void main(String[] args) {
		
		
		 Account account = new DepositAccount();
		 double result=account.interst(15000, 2, 24);
		 System.out.println(result);
		 account.allInOne();
		 
		 Account account1 = new FixedDepositAccount();
		 account1.interst(25000, 1.5, 24);
		 

	}

}
