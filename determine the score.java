import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t-->0){
		    int x = sc.nextInt(); //total points
		    int y = sc.nextInt(); //No. of test cases
		    
		    int eachTestPoint = x/10;
		    int score = eachTestPoint*y;
		    System.out.println(score);
		}	// your code goes here

	}
}
