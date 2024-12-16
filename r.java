import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		if(H>=1 & H<=24)
		{
		    if(H<8)
		    {
		        System.out.println("less");
		    }
		    else if(H==8)
		    {
		        System.out.println("perfect");
		    }
		    else{
		        System.out.println("more");
		    }
		}
	}
}
