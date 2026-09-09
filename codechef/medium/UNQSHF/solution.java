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
		    String a = sc.next();
		    String b = sc.next();
		    
		    int counta = 0,countb = 0;
		    
		    for(int i = 0; i < n;i++)
		    {
		        if(a.charAt(i) == 'a')
		        {
		            counta++;
		        }
		        if(b.charAt(i) == 'a')
		        {
		            countb++;
		        }
		    }
		    if(counta + countb == n)
		      System.out.println("YES");
		    else
		    System.out.println("NO");
		}
		

	}
}
