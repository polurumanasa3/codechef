import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
 Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=0;i<n;i++){
	        int a=s.nextInt();
	        if(a<=100)
	        System.out.println(a);
	        else if(a>100 && a<=1000)
	        System.out.println(a-25);
	        else if(a>1000 && a<=5000)
	        System.out.println(a-100);
	        else
	        System.out.println(a-500);
	    }
		// your code goes here
	}
}
