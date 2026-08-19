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
	        int o = 0, e = 0;
	        for(int i = 0; i < n; i++)
	        {
	            int x = sc.nextInt();
	            if(x % 2 == 0)
	                e++;
	            else
	               o++;
	        }
	        int ans = 2 * Math.min(o,e);
	        if(o != e)
	          ans++;
	          
	          System.out.println(ans);
	    }

	}
}
