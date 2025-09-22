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
		    int x = in.nextInt();//Current rating of Alice
		    int y = in.nextInt(); //Rating that Alice wants
		    y -= x;
		    System.out.println(y%8==0?y/8:(y/8)+1);
		}
		in.close();	// your code goes here

	}
}
