import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner kk=new Scanner(System.in);
		int testcases=kk.nextInt();
		while(testcases-->0)
		{
		    int n=kk.nextInt();
		    int m=kk.nextInt();
		    if(m>=n)
		    System.out.println(n);
		    else
		    System.out.println((n-m)+n);
		}	// your code goes here

	}
}
