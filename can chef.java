import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  b=b*2;
      if(a*15>=b)
		  {
		    System.out.println("YES");
		  }
		  else
		  {
		    System.out.println("NO");
		  }
		}	// your code goes here

	}
}
