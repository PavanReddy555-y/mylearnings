package bankTypes;

public class Account 
{
	private long accNo;
	private String name;
	private int ifscCode;
	
	public Account(long accNo, String name, int ifscCode) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.ifscCode = ifscCode ;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	/*public String toString() {
		return accNo+" " +name +" "+ ifscCode;
	}
	public boolean equals(Object o)
	{
		Account a = (Account) o;
		return this.accNo==accNo && this.ifscCode==ifscCode && this.name.equals(a.name);
	}
	public int hashCode()
	{
		return (int)accNo+ifscCode+name.hashCode();
	}*/
	
	
}
