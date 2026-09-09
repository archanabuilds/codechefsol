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
		    int  n = sc.nextInt();
		    
		    HashMap<Integer,Integer> map = new HashMap<>();
		    int max = 0;
		    
		    for(int i = 0; i < n; i++)
		    {
		        int x = sc.nextInt();
		        
		        int freq = map.getOrDefault(x,0) + 1;
		        map.put(x,freq);
		        
		        max = Math.max(max,freq);
		        
		    }
		    System.out.println((max + 1)/2);
		}

	}
}
