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
		    
		    int x = 0;
		    int y = 0;
		    
		    for(int i = 0; i < n; i++)
		    {
		        char ch = s.charAt(i);
		        
		        if(ch == 'U') y++;
		        else if(ch == 'D') y--;
		        else if(ch == 'L') x--;
		        else if(ch == 'R') x++;
		        
		    }
		    if((x == 2 && y == 0) || (x == -2 && y == 0) ||
		        (x == 0 && y == 2) || (x == 0 && y == -2)){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		}

	}
}
