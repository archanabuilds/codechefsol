import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while( n % 10 != 0)
		{
		    n++;
		    count++;
		    
		}
 System.out.println(count);
	}
}
