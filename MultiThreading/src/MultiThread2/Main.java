package MultiThread2;

public class Main 
{
	public static void main(String[] args) 
	{
		Runnable r1 = () ->
		{
			System.out.println("L1");
		};
		Runnable r2 = ( )->{
			System.out.println("L2");
		};
		Runnable r3 = () ->
		{
			System.out.println("L3");
		};
		Runnable r4 = ( )->{
			System.out.println("L4");
		};
		
		
		MyThread1 m1 = new MyThread1();
		m1.start();
		MyThread2 m2 = new MyThread2();
		m2.start();
		MyThread3 m3 = new MyThread3();
		m3.start();
		MyThread4 m4 = new MyThread4();
		m4.start();
		
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		Thread t3 = new Thread(r3);
		t3.start();
		Thread t4 = new Thread(r4);
		t4.start();
		
		
		MyRun1 l1 = new MyRun1();
		Thread th1 = new Thread(l1);
		th1.start();
		MyRun2 l2 = new MyRun2();
		Thread th2 = new Thread(l2);
		th2.start();
		MyRun3 l3 = new MyRun3();
		Thread th3 = new Thread(l3);
		th3.start();
		MyRun4 l4 = new MyRun4();
		Thread th4 = new Thread(l4);
		th4.start();
		
	}

}
