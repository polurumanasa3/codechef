import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		while(t!=0){
		    int n  = s.nextInt();
		    int m = s.nextInt();
		    int k = s.nextInt();
		    int val = m-k;
		    if(val>=n)System.out.println("YES");
		    else System.out.println("NO");
		    
		    t--;
		}	// your code goes here

	}
}
