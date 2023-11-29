package hospitalManagement;

import java.util.*;
import java.util.LinkedHashSet;

public class Hospital 
{
	LinkedHashSet<Patient>  lk = new LinkedHashSet<>();
	Scanner sc = new Scanner(System.in);

		
		public void display()
		{
			Iterator<Patient> i =lk.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			System.out.println();
		}

		public void admit() 
		{
			System.out.println("Enter Patient id:");
			int id =Integer.parseInt( sc.nextLine());
			boolean check = false;
			for(Object ob : lk)
			{
				Patient p = (Patient)ob;
				int pid = p.getpId();
				if(pid == id)
				{
					check=true;
				}	
			}
			if(check)
			{
				System.out.println("Patient id already Existed....\n");
			}
			else
			{
				System.out.println("Enter Patient name.");
				String name =sc.nextLine();
				System.out.println("Patient Problem ");
				String problem = sc.nextLine();
				System.out.println("Patient Age ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.println("Patient AdmitDate ");
				String adDate = sc.nextLine();
				System.out.println("Patient DisCharge date ");
				String disDate = sc.nextLine();
				System.out.println("Patient Bill ");
				double bill =Double.parseDouble(sc.nextLine()) ;
				System.out.println("Patient Hospital ");
				String hospital = sc.nextLine();
				System.out.println("Patient Doctor ");
				String doct = sc.nextLine();
				
				
				Patient pd = new Patient(id,name,problem,age,adDate,disDate,bill,hospital,doct);
				lk.add(pd);
				System.out.println("Admission successfull......\n");
			}
		}
		
		public void discharge()
		{
			System.out.println("Enter Patient id");
			int id = Integer.parseInt(sc.nextLine());
			boolean dcheck=false;
			for(Object o : lk)
			{
				Patient p =(Patient)o;
				int pid = p.getpId();
				if(id==pid)
				{
					dcheck=true;
					lk.remove(p);
					break;
				}
			}
			if(dcheck)
			{
				System.out.println("Patient Discharde Sucessfully...\n");
			}else {
				System.out.println("Invalid id ....\n");
			}
			
		}	
		
		public void PatBiil()
		{
			System.out.println("Enter the Patient Name...");
			String name = sc.nextLine();
			boolean pcheck = true;
			for(Object o : lk)
			{
				Patient p =(Patient)o;
				String pname = p.getpName();
				if(name.equals(pname))
				{
					System.out.println(p.getpBil());
					pcheck=false;
				}	
			}
			if(pcheck)
			{
				System.out.println("No Patients are admitted with that name...\n");
			}
			
		}
		public void patiListByHospital()
		{
			System.out.println("Enter the Hospital Name...");
			String hospname = sc.nextLine();
			boolean hcheck = true;
			for(Object ob : lk)
			{
				Patient p =(Patient)ob;
				String hname = p.getpHospital();
				if(hospname.equals(hname))
				{
					System.out.println(p.getpName());
					hcheck=false;
				}
				
			}
			if(hcheck)
			{
				System.out.println("No Patients are admitted in this Hospital...\n");
			}
			
			
		}
	
}
