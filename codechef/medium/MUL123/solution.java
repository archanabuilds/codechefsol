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
              int count = 0;
              int n = sc.nextInt();
              if( n % 3 == 0){
              System.out.println(0);
              continue;
              }
              int x = n;
              int c1 = 0;
              while( x % 3 != 0)
              {
                  x++;
                  c1++;
              }
              int y = ((n/5)+1) * 5;
              int c2 = 1;
              
              while(y % 3 != 0)
              {
                  y++;
                  c2++;
              }
              System.out.println(Math.min(c1,c2));
          }
	}
}
