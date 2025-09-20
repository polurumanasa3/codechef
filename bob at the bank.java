import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();                // number of test cases
        while(t-- > 0){
            int w = sc.nextInt();            // initial balance
            int x = sc.nextInt();            // monthly deposit
            int y = sc.nextInt();            // monthly deduction
            int z = sc.nextInt();            // number of months
            
            int netChange = x - y;           // effective change per month
            int finalBalance = w + (netChange * z); // total balance after z months
            
            System.out.println(finalBalance);
        }	// your code goes here

	}
}
