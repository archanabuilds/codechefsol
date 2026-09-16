import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            long[] a = new long[n];
            long sum = 0;
            
            for(int i = 0; i < n;i++)
            {
                a[i] = sc.nextLong();
                sum += a[i];
            }
            Arrays.sort(a);
            
            long rsum = 0;
            long ans = 0;
            
            for(int k = 1; k < n; k++)
            {
                rsum += a[n - k];
                
                long  bsum = sum - rsum;
                long bcount = n - k;
                
                long val = rsum * bcount + bsum * k;
                
                ans = Math.max(ans,val);
            }
            System.out.println(ans);
        }
	}
}
