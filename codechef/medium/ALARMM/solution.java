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
           int k = sc.nextInt();
           String s = sc.next();
           int count = 0;
           int i = 0;
           
           while(i < n){
               if(s.charAt(i) == '1')
               {
                   count++;
                   i += k + 1;
               }
               else{
                   i++;
               }
           }
           System.out.println(count);
       }
	}
}
