package hospitalManagement;

public class Patient {

	private int pId;
	private String pName;
	private String pProblem;
	private int pAge;
	private String pAdimitDate;
	private String pDishDate;
	private double pBil;
	private String pDoctor;
	private String pHospital;
	
	Patient(	int pId,String pName,String pProblem,int pAge,String pAdimitDate,String pDishDate,
			double pBil,String pHospital,String pDoctor)
	{
		this.pId=pId;
		this.pName=pName;
		this.pProblem=pProblem;
		this.pAge=pAge;
		this.pAdimitDate=pAdimitDate;
		this.pDishDate=pDishDate;
		this.pBil=pBil;
		this.pHospital=pHospital;
		this.pDoctor=pDoctor;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpProblem() {
		return pProblem;
	}
	public void setpProblem(String pProblem) {
		this.pProblem = pProblem;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public String getpAdimitDate() {
		return pAdimitDate;
	}
	public void setpAdimitDate(String pAdimitDate) {
		this.pAdimitDate = pAdimitDate;
	}
	public String getpDishDate() {
		return pDishDate;
	}
	public void setpDishDate(String pDishDate) {
		this.pDishDate = pDishDate;
	}
	public double getpBil() {
		return pBil;
	}
	public void setpBil(double pBil) {
		this.pBil = pBil;
	}
	public String getpDoctor() {
		return pDoctor;
	}
	public void setpDoctor(String pDoctor) {
		this.pDoctor = pDoctor;
	}
	public String getpHospital() {
		return pHospital;
	}
	public void setpHospital(String pHospital) {
		this.pHospital = pHospital;
	}
	public String toString()
	{
		return "Patient id: " + pId +" Patient Name: "+pName+ " Patient Problem : "+pProblem+ " Patient Age :"+pAge+ 
				" Patient AdmitDate : "+ pAdimitDate+ " Patient DisCharge date :"+ pDishDate + " Patient Bill :"+ pBil+
				" Hospital :"+ pHospital+" Doctor :"+pDoctor +"\n";
	}
	
}
