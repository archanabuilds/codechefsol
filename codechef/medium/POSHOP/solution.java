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
           int[] c = new int[n];
           for(int i = 0; i < n; i++)
            c[i] = sc.nextInt();
            
            int ans = 0;
            for(int i = 0; i < n; i++)
              ans = Math.max(c[i],ans);
            for(int i = 0 ; i < n; i++)
             {
                 for(int j = i + 1; j < n;j++)
                 {
                     if(c[i] <= c[j])
                     {
                         ans = Math.max(ans,c[i] + c[j]);
                     }
                 }
             }  
             System.out.println(ans);
       }
	}
}
