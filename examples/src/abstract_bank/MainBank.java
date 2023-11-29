package abstract_bank;

public class MainBank {

	public static void main(String[] args) 
	{
		Bank b = new CusDetails();
		b.idValidate();
		b.accStatus();
		CusDetails c = (CusDetails) b;
		c.setAccNo(986486465l);
		c.setAccBalance(98456.97);
		c.setName("Tata");
		System.out.println(c.getAccNo());
		System.out.println(c.getAccBalance());
		System.out.println(c.getName());
		
				

	}

}
