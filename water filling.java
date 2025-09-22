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
		    int b1 = in.nextInt(); //Status of bottle 1
		    int b2 = in.nextInt(); //Status of bottle 2
		    int b3 = in.nextInt(); //Status of bottle 3
		    System.out.println((b1+b2+b3)<2?"Water filling time":"Not now");
		}
		in.close();	// your code goes here

	}
}
