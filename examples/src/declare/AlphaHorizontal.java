package declare;
import java.util.Scanner;
public class AlphaHorizontal 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num =scan.nextInt();
		char ch ='A';
		for(int i=1;i<=26;i++)
		{
			if (i==num)
			{
				System.out.println(ch+"\t"+num);
			}
			ch++ ;
		}
		scan.close();

	}

}
