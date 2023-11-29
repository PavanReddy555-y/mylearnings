package maccess;
import test.*;
import java.util.*;
public class BankMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int count=0;
		xyz:
		while(true)
		{
			System.out.println("Enter the PinNo");
			int pinNo=sc.nextInt();
			PinNoCheck pc = new PinNoCheck();
			boolean k=pc.verify( pinNo);
			if(k)
			{
				System.out.println("===Choice===");
				System.out.println("1.Deposite \n2.withdraw");
				System.out.println("Enter the choice:");
				int choice=sc.nextInt();
				switch(choice)
				{
					case 2:
						System.out.println("Enter the amt:");
						int a1=sc.nextInt();
						if(a1>0 && (a1%100==0))
						{
							Withdraw wd = new Withdraw();
							wd.process(a1);
						}
						else 
						{
							System.out.println("InSufficient funds....");
						}
						break xyz;
					case 1:
						System.out.println("Enter the amt:");
						int a2=sc.nextInt();
						if(a2>0 && a2%100==0)
						{
							Deposite dp = new Deposite();
							dp.process(a2);
						}
						else 
						{
							System.out.println("InSufficient funds....");
						}
					break xyz;
					default:
					{
						System.out.println("invalid Choice...");
						break xyz;
					}
				}
				
			}
			else
			{
				System.out.println("Invalid Pin..");
				count++;
			}
			if(count==3)
			{
				System.out.println("Transaction Blocked:");
				break xyz;
			}
			
		}
		sc.close();
	}
 
}
