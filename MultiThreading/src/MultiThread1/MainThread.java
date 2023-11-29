package MultiThread1;

public class MainThread 
{
	public static void main(String[] args) {
		
		Runnable r1 = () ->
		{
			for(int i=1;i<=5; i++)
			{
				System.out.println(i);
			}
		};
		Runnable r2 = () ->
		{
			for(char i='A';i<='F'; i++)
			{
				System.out.println(i);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
		
		
		MyThread m1 = new MyThread();
		Thread t3 = new Thread(m1);
		t3.start();
		
		
		for(char c='a'; c<='f'; c++)
		{
			System.out.println(c);
		}
	}
}
