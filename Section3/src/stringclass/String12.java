package stringclass;

public class String12 {
	public static void main(String[] args) {
		String s="abc bwwe";
		String s1="bwwe";
		int startIndex=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				startIndex=i;
			}
		}
		int count=0;
		for(int i=startIndex;i<s.length();i++)
		{
			count++;
		}
		int count1=0;
		for(int i=0;i<s1.length();i++)
		{
			count1++;
		}
		if(count==count1)
		{
			boolean flag=false;
			for(int i=0;i<s1.length();i++)
			{
				int j=startIndex;
				if(s1.charAt(i)==s.charAt(j))
				{
					flag=true;
					startIndex++;
				}
				else
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.println("String is present");
			}
			else
			{
				System.out.println("String is not present");
			}
		}
			else
			{
				System.out.println("String not present");
			}
		
	}

}
