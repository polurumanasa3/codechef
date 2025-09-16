import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int b=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		int s=r*p;
		int t=b*q;
		if(s>t){
		    System.out.println(s);
		}else{
		    System.out.println(t);
		}
			// your code goes here

	}
}