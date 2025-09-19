import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while(T-->0) {
			int friends = sc.nextInt();
			int passes =  sc.nextInt();
			String canEnterWithAllFriends;
			canEnterWithAllFriends = passes>=(1+friends)? "YES":"NO";
			System.out.println(canEnterWithAllFriends);
		}//while	// your code goes here

	}
}
