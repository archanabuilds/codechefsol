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
		    int m  = sc.nextInt();
		    int x = sc.nextInt();
		    
		    int row = (x - 1) / m + 1;
		    
		    int front = row;
		    int back = n - row + 1;
		    System.out.println(Math.min(front , back));
		}

	}
}
