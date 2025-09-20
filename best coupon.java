import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t, x;
		
		t = sc.nextInt();
		while (t --> 0){
		    x = sc.nextInt();
		    double c = x * 0.1;
		    System.out.println((int)Math.max(c, 100));
		}	// your code goes here

	}
}
