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
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    
		    boolean[] occ = new boolean[n + 1];
		    
		    for(int i = 0; i < m; i++)
		    {
		        int seat = sc.nextInt();
		        occ[seat] = true;
		    }
		    
		    for(int p = 0; p < k; p++)
		    {
		        for(int seat = 1; seat <= n; seat++)
		        {
		            if(!occ[seat])
		            {
		                System.out.println(seat + " ");
		                occ[seat] = true;
		                break;
		            }
		        }
		    }
		    System.out.println();
		}

	}
}
