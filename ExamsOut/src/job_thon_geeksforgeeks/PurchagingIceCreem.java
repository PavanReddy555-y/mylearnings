package job_thon_geeksforgeeks;

import java.io.*;


public class PurchagingIceCreem {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine().trim());
		while(t--> 0)
		{
			String s[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			
			int a[] = new int[n];
			s = br.readLine().trim().split(" ");
			for(int i=0; i<n; i++)
			{
				a[i] = Integer.parseInt(s[i]);
			}
			new solution();
			ot.println(solution.findGoodPairs(a,n,k));
		}
		
	}

}
