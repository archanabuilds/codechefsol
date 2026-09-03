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
            long n = sc.nextLong();
            if( n == 1)
            System.out.println(1);
           else if(n % 3 == 1)
             System.out.println(n + 3);
            else if(n % 3 == 2)
            System.out.println(n + 2);
            else
            System.out.println(n + 1);
        }
	}
}
