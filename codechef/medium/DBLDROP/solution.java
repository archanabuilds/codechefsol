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
            long[] a = new long[n];
            long sum = 0;
            
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                sum += a[i];
            }
            long ans = 0;
            
            for(int i = 0; i < n; i++){
                long max = 0;
                for(int j = 0; j < n; j++){
                    long val = a[j];
                    
                    if(i == j){
                        val = val * 2;
                    }
                    if(val > max){
                        max = val;
                    }
                }
                long newSum = sum + a[i];
                long score = newSum - max;
                
                if(score > ans){
                    ans = score;
                }
            }
            System.out.println(ans);
        }
	}
}
