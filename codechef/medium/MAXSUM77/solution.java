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
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            int s = n - k;
            int sum = 0;
            
            for(int i = 0; i < s; i++)
            {
                sum += a[i];
            }
            int max = sum;
            
            for(int i = s; i < n; i++)
            {
                sum = sum - a[i - s] + a[i];
                max = Math.max(max,sum);
                
            }
            System.out.println(max);
        }
	}
}
