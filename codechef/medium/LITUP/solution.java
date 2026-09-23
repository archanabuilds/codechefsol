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
		    int k = sc.nextInt();
		    int[] c = new int[n];
		    for(int i = 0; i < n; i++)
		    {
		        c[i] = sc.nextInt();
		    }
		    int ans = Integer.MAX_VALUE;
		    for(int i = 0; i < n; i++)
		    {
		        for(int j = 0; j < n; j++)
		        {
		            if(i-k <= 0 && j+k >= n-1 && j-1 <= 2*k)
		            {
		                ans = Math.min(ans,c[i]+c[j]);
		            }
		        }
		    }
		    if(ans == Integer.MAX_VALUE)
		    System.out.println(-1);
		    else
		    System.out.println(ans);
		}
		

	}
}
