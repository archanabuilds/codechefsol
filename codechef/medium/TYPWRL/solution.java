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
		    
		    String s = sc.next();
		    String l = sc.next();
		    
		    int curr = 1;
		    int max = 1;
		    
		    boolean prev = l.indexOf(s.charAt(0)) != -1;
		    
		    for(int i =1;i < n; i++)
		    {
		        boolean curh = l.indexOf(s.charAt(i)) != -1;
		        if(curh == prev)
		        {
		            curr++;
		        }
		        else{
		            curr = 1;
		        }
		        if(curr > max)
		        {
		            max = curr;
		        }
		        prev = curh;
		    }
		    System.out.println(max);
		}
		

	}
}
