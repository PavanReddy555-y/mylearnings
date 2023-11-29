package practiceClass;

public class StringClass 
{
	public static void main(String[] args) 
	{
		String s="MAVA";
		String sv="mava";
		String s1="java";
		String s2="  JAVA";
		System.out.println(s1==s2);
		System.out.println(s.equals(sv));//false
		System.out.println(s.equalsIgnoreCase(sv));// true
		System.out.println(s1.compareTo(s2));// 74
		
		System.out.println(s1.toUpperCase());//JAVA
		
		System.out.println(s2.toLowerCase());//java
		
		System.out.println(s1.concat(s2));//java  JAVA
		
		System.out.println(s2=s2.trim());//JAVa
		
		System.out.println(s2.charAt(3));//A
		
		System.out.println(s1.substring(1));// ava
		System.out.println(s1.substring(1, 3)); // av
		
		System.out.println(s1.length());//4
		
		System.out.println(s1.indexOf('v'));//2
		System.out.println(s1.indexOf('s'));// -1
		
		System.out.println(s1.contains("va"));//false
		System.out.println(s1.contains("vj"));//false
		
		System.out.println(s1.isEmpty());// false
		
	}
}
