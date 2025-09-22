import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner neigh = new Scanner(System.in);
		int T = neigh.nextInt();
		while(T-->0){
		    int X = neigh.nextInt();
		    int Y = neigh.nextInt();
		    int A = X / Y;
		    if(A > 20){
		        System.out.println(20);
		    }
		    else{
		        System.out.println(A);
		    }
		}
	// your code goes here

	}
}
