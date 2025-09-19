import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
		int T = in.nextInt(); //for No. of test cases
		while(T-->0) {
		    //your code goes here
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = in.nextInt();
		    System.out.println(0.5*(a+b)>c?"Yes":"No");
		}	// your code goes here

	}
}
