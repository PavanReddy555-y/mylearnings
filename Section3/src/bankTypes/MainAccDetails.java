package bankTypes;

public class MainAccDetails 
{

	public static void main(String[] args) 
	{
		SavingsAc  sv = new SavingsAc(9133082600l, " Pavan ", 16176 , 30000);
		SavingsAc  sv1 = new SavingsAc(9133082600l, " Pavan ", 16176 , 30000);
		sv.displayBalance();
		sv1.displayBalance();
		System.out.println(sv);
		System.out.println(sv==sv1);
		System.out.println(sv.equals(sv1));
		System.out.println(sv.hashCode()== sv1.hashCode() );
		System.out.println("===================================");
		LoanAc la = new LoanAc(913308260l,"Pavan",16176,30000);
		LoanAc la1 = new LoanAc(9133082600l, "pavan", 16176,30000);
		la.displayLoan();
		la1.displayLoan();
		System.out.println(la);
		System.out.println(la==la1);
		System.out.println(la.equals(la1));
		System.out.println(la.hashCode()== la1.hashCode() );
		
		

	}
}
