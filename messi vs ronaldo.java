mport java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		if(((a*2)+b)>((c*2)+d)){
		    System.out.println("Messi");
		}
		else if(((a*2)+b)<((c*2)+d)){
		    System.out.println("Ronaldo");
		}
		else{
		    System.out.println("Equal");
		}	// your code goes here

	}
}
