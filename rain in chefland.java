import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a=s.nextInt();
		    if(a<3)
		    {
		        System.out.println("LIGHT");
		    }
		    else if(a>=3 && a<7)
		    {
		        System.out.println("MODERATE");
		    }
		    else if(a>=7)
		    {
		        System.out.println("HEAVY");
		    }
		}	// your code goes here

	}
}