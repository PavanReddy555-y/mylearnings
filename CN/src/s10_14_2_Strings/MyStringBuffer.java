package s10_14_2_Strings;

public class MyStringBuffer {
	
	
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("PavanReddy");
		//buffer.append("PavanReddy");
		StringBuffer buffer1 = new StringBuffer();
		buffer1.append("PavanReddy");
		
		System.out.println(buffer == buffer1);
		System.out.println(buffer.toString().equals(buffer1.toString()));
	}

}
