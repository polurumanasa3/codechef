import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();//old judging system
		int y=sc.nextInt();//new judging system
		if(x<y)
		{
		    System.out.println("Old");
		}
		else if(x>y)
		{
		    System.out.println("New");
		}
		else{
		    System.out.println("Same");
		}	// your code goes here

	}
}
