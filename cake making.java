import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int total = A * B;
        int small = Math.min(A, B);
        int ans = total-small;
        System.out.println(ans);

			// your code goes here

	}
}
