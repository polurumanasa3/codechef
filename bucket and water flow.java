import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0){
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    int d=s.nextInt();
		    if(a+c*d>b)
		    System.out.println("overflow");
		    else if(a+c*d==b)
		    System.out.println("filled");
		    else
		    System.out.println("unfilled");
		}	// your code goes here

	}
}
