package declare;

public class SunnyNo
{

	public static void main(String[] args) 
	{
		int n=8;
		int i;
		boolean check=false;
		for(i=1;i<=n/2;i++)
		{
			check=true;
			break;
		}
		if(check)
		{
			System.out.println(n+" is  a sunny number");
		}
		else
		{
			System.out.println(n+" is not  a sunny number");
		}
			
	}

}
