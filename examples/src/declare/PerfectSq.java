package declare;
import java.util.Scanner;
public class PerfectSq 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int sq=sc.nextInt();
        boolean check=false;
        for(int i=1;i<=sq/2; i++)
        {
            if(i*i==sq)
            {
                check=true;
                break;
            }
           
        }
        if(check)
        {
        	System.out.println(sq+" is a perfect Square");
        }
        else
        {
        	System.out.println(sq+" is not a perfect Square");
        }
        sc.close();
	}

}
