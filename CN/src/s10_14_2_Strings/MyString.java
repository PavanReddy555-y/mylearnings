package s10_14_2_Strings;

public class MyString {
	public static void main(String[] args) {
		
		
		String name = "PavanReddy";
		String name1 = "PavanReddy";
		String sName = new String("PavanReddy");
		
		System.out.println(name==name1);// true
		System.out.println(name==sName);// false
		System.out.println(name1==sName);// false
		
		
		System.out.println(name.length());//10
		System.out.println(sName.length());//10
		System.out.println(name.charAt(0));// P
		System.out.println(name.compareTo(sName));//0
		System.out.println(name.isEmpty());//false
		System.out.println(name.contains(sName));//true
		System.out.println(name.substring(5));// Reddy
		System.out.println(name.substring(5, 8));//Red----- it will work from start index to end index-1
		
		System.out.println(name.equals(sName));// true
		String name2 = "Pavan"
;	}

}
