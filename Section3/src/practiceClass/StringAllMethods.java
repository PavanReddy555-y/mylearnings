package practiceClass;

public class StringAllMethods {

	public static void main(String[] args)
	{
		String s= "Developer";
		String s1 ="DEVELOPER";
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s.concat(s1));
		
		System.out.println(s.length());
		
		System.out.println(s.indexOf('e'));//1
		System.out.println(s.indexOf("lop"));//4
		System.out.println(s.indexOf('e',3));//3
		System.out.println(s.indexOf('l', 8));//-1
		System.out.println(s.indexOf('e', 6)); //7
		
		
		System.out.println(s.indexOf("vel",2)); //2
		System.out.println(s.indexOf("vel",4)); // -1
		
		//System.out.println(s.lastIndexOf('e'));
		
		
		
		

	}

}
