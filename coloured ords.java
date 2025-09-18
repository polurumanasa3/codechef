import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int B=sc.nextInt();
		if(R==B)
		{
		    System.out.println(R*5);
		}else if(R>B)
		{
		    System.out.println((B*5)+(R-B));
		}else{
		    System.out.println((R*5)+((B-R)*2));
		}	// your code goes here

	}
}
