import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int cost1 = 3 * a;
		int cost2 = a + b;
		
		System.out.println(Math.min(cost1,cost2));

	}
}
