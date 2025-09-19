import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
            int p = sc.nextInt();
            int l = sc.nextInt();

            double x = ((double) l / p) * 100;

            if (x>= 75) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }	// your code goes here

	}
}
