package S8_Exceptions;

public class ArithMetic {
	
	public static void display(int a, int b)
	{
		int c = a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		int a=3;
		int b=0;
		
		ArithMetic.display(a,b);
	}

}
