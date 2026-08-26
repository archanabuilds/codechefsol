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
             int a = sc.nextInt();
             int b = sc.nextInt();
             int p = sc.nextInt();
             int q = sc.nextInt();
             int r = sc.nextInt();
             
             int ans = Integer.MAX_VALUE;
             for(int d = 0; d <= Math.min(a,b); d++)
             {
                 int cost = d * r;
                 
                 int right = a - d;
                 int up = b - d;
                 
                 cost += ((right + 1) /2) *p;
                 cost += ((up + 1) /2) * q;
                 
                 ans = Math.min(ans,cost);
             }
             System.out.println(ans);
         }
	}
}
