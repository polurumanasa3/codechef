import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int course=sc.nextInt();
		    int unit=sc.nextInt();
		    int chapter=sc.nextInt();
		    System.out.println(course*unit*chapter);
		}	// your code goes here

	}
}
