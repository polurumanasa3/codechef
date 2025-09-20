import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    
		    // if no of people applied less than equal to total capacity
		    if (Y <= 10*X ) {
		        System.out.println(Y*Z);
		        
		    } else {
		        // no of people applied more than  total capacity
		        // totalCapacity * price
		        System.out.println(10*X*Z);
		    }
		}	// your code goes here

	}
}
