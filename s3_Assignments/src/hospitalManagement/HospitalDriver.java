package hospitalManagement;

import java.util.Scanner;

public class HospitalDriver  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
		Hospital h = new Hospital();
		
		Patient p1 = new Patient(1, "bava", "Fever", 22, "21-11-22", "25-11-22", 25000.0,"JMJ","Dr.Manoj");
		Patient p2 = new Patient(2, "Ghani", "cough", 25, "21-06-22", "25-11-22", 7000.0,"RISHI","Dr.swathi");
		Patient p3 = new Patient(3, "Dali", "cold", 24, "10-11-05", "15-05-22", 5000.0,"RUYA","Dr.Lilli");

		
		h.lk.add(p1);
		h.lk.add(p2);
		h.lk.add(p3);	
		
		int i=1;
		while(i>0)
		{
			System.out.println("1.Admitting the Patient.");
			System.out.println("2.Discharge the Pattient. ");
			System.out.println("3.Display Patient Details. ");
			System.out.println("4.Totat bill for the Patient. ");
			System.out.println("5.Patient list by hospital name.");
			System.out.println("6.Exit from the Program.");
			System.out.println("Enter Choice Number.....");
			int choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
			{
				h.admit();
				break;
			}
				
			case 2:
			{
				h.discharge();
				break;
			}
				
			case 3:
			{
				h.display();
				break;
			}
				
			case 4:
			{
				h.PatBiil();
				break;
			}
			case 5:
			{
				h.patiListByHospital();
				break;
			}
				
			case 6:
			{
				 i=0;
				System.out.println("Program Ended......!");
				break;
			}
				
			default :
			{
				System.out.println("invalid input.......");
				break;
			}
				
					
			}
		}
		
		sc.close();
		
	}

	

	

}
