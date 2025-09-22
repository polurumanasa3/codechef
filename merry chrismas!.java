import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		if(n<1)
		{
		    System.out.println("0");
		}
		if(n==1 || n<3){
		    System.out.println("1");
		}
		if(n>=3){
		    if(n==3||n<7){
		        System.out.println("2");
		    }
		    if(n>=7){
		        System.out.println("3");
		    }
		}	// your code goes here

	}
}
