import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int flag = 0;
		for(int i = l ; i <= r ; i++)
		{
		    if(i % 2 == 0){
		    flag = 1;
		    break;
		    }
		}
       if(flag == 0)
        System.out.println("No");
        else
        System.out.println("yes");
	}
}
