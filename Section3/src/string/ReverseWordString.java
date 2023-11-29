package string;

public class ReverseWordString {

	public static void main(String[] args) 
	{
		System.out.println("Enter the String....");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String s = sc.nextLine();
		
		String [] rs = s.split(" ");
		System.out.println("Out put .......");
		for(int i=rs.length-1; i>=0; i--) 
		{
			
			System.out.print(rs[i]+ " ");
		}
		
		
		
		sc.close();

	}

}
