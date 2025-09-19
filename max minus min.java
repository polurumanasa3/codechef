import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		      int c=sc.nextInt();
		      
		    System.out.println(Math.max(Math.max(a,b),c)-Math.min(Math.min(a,b),c));
		}	// your code goes here	// your code goes here

	}
}
