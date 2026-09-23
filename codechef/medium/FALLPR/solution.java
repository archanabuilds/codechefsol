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
		    int[] a = new int[n];
		    for(int i = 0; i < n; i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    
		    long sum = 0;
		    int min = Integer.MAX_VALUE;
		    boolean deleted = false;
		    boolean possible = true;
		    
		    for(int i = 0; i< n; i++)
		    {
		        sum += a[i];
		        min = Math.min(min,a[i]);
		        if(sum < 0)
		        {
		            if(deleted)
		            {
		                possible = false;
		                break;
		            }
		            sum -= min;
		            deleted = true;
		        }
		    }
		    System.out.println(possible ? "YES" : "NO");
		}
		sc.close();

	}
}
