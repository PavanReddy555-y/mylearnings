package lambda1;

public class Main {

	public static void main(String[] args) 
	{
		interface1 add, sub;
		add = (a,b )->
		{
			int c= a+b;
			return c;
		};
		sub = (a,b)->
		{
			int c= a-b;
			return c;
		};
			
		System.out.println("Addition value is : "+add.draw(4,2));
		System.out.println("Substrsction value is : "+sub.draw(4,2));
		

	}

}
