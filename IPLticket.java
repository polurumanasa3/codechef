import java.util.*;
import java.lang.*;
import java.io.*;

class IPLtickets
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	    int t,m,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    n = sc.nextInt();
		    m = sc.nextInt();
		    if(m>=n)
		    System.out.println(0);
		    else
		    System.out.println(n-m);
		}
		
	}
}
