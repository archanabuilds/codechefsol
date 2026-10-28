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
             String s = sc.next();
             
             int count = 0;
             int st = 0;
             
             for(int i = 0; i < n; i++)
             {
                 if(i == 0 || s.charAt(i) == s.charAt(i - 1))
                  st++;
                 else 
                  st = 1;
                
                if(st == 3)
                {
                    count++;
                    st = 0;
                }
             }
             System.out.println(count);
         }
	}
}
