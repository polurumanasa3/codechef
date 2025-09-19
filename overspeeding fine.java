import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner c=new Scanner(System.in);
		int t=c.nextInt();
		while(t-->0){
		    int n=c.nextInt();
		    System.out.println((n<=70)?0:(n>70&&n<=100)?500:2000);
		}	// your code goes here

	}
}
