package declare;

public class MainOverRide extends DupeOverRide
{
	
	public void wish()
	{
		System.out.println("It is in main class:");
	}
	public static void main(String[] args) 
	{
		DupeOverRide d = new MainOverRide();
		d.display();
	}

}
