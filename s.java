import java.util.*;
import java.lang.*;
import java.io.*;

class s
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int i=0;i<T;i++)
	{
	    int X=sc.nextInt();
	    if(X>=1 && X<=10)
	    {
	        System.out.println("yes");
	    }
	    else{
	        if(X>10 && X<=100)
	        System.out.println("no");
	    }
	}
	
	}	    
	
}
	