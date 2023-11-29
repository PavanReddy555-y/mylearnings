package string;

public class Sring1 {

	public static void main(String[] args) {
		String s1 = new String("ram");
		String s2 = "ram";
		String s3=s2;
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s3);
	}

}
