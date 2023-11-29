package declare;

public class AmstrongNo {

	public static void main(String[] args) 
	{
		int n = 153;
		int temp=n;
		int last=n;
		int sum=0;
		int count = 0;
		
		
		while(n>0)
		{
			n =n/10;
			count++;
		}
		
		while(temp>0) 
		{
			int pow=1;
			int rem=temp%10;
			for(int i=1;i<=count;i++)
			{
				pow=pow*rem;
			}
			sum=sum+pow;
			temp=temp/10;
			System.out.println(sum);
		}
		if(last==sum)
		{
			System.out.println(last+" is a amstrong Number");
		}
	}

}
