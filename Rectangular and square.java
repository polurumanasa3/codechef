import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
        
		int b = scn.nextInt();
		
		int c = scn.nextInt();
		
		int recarea = a*b;
		int recsqua = c*c;
		
		if(recarea == recsqua){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}	// your code goes here

	}
}
