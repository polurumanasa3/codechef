import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int n = a+b;
	        int count = 0;
	        for(int i = 1; i<=n; i++)
	        {
	            if(n%i==0)
	            {
	                count = count+1;
	            }
	        }
	        if(count==2)
	        {
	            System.out.println("Alice");
	        }
	        else{
	            System.out.println("Bob");
	        }
	        
	    }	// your code goes here

	}
}
