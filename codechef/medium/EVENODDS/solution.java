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
		while(t-- > 0){
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    
		    for(int i = 0; i < n; i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    int max = 0;
		    
		    for(int i = 0; i < n; i++){
		        int count = 0;
		        
		        for(int j = i; j < n; j++)
		        {
		            if(a[j] % 2 != 0){
		                count++;
		            }
		            
		            if(count % 2 == 0){
		                max = Math.max(max,j-i+1);
		            }
		        }
		    }
		    
		}

	}
}
