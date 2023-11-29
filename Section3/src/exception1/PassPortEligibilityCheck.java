package exception1;

public class PassPortEligibilityCheck {
	String name=null;
	public static void main(String[] args) {
		int age = 17;
		
		PassPortEligibilityCheck ps = new PassPortEligibilityCheck();
		try {
			System.out.println(ps.name.length());
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
			
			if(age<18)
			{
				try {
					throw new InvalidAgeForPassPortException("Age is not valid for Passport application age Should be Above 18");
				}catch(Exception a)
				{
					System.out.println(a.getMessage());
				}
				
			}
			else {
				System.out.println("Age is vaalid to apply for Passport move forther......Thank you.......");
			}
		}
		

		
		System.out.println("Thanks for using this application ");

	}

}
