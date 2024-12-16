import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
                int A = sc.nextInt();
                int a = sc.nextInt();
                int B = sc.nextInt();
                int b = sc.nextInt();
                int C = sc.nextInt();
                int c = sc.nextInt();
                
              int p =  Math.max(A,a);
              int q = Math.max (B,b);
              int r = Math.max (C,c);
              
              System.out.println(p+q+r);
        

	}
}