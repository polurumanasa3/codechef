import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Read number of toffees
        
        int remainder = N % 3;
        int imbalance;

        if (remainder == 0) {
            imbalance = 0;
        } else {
            imbalance = 1;
        }

        System.out.println(imbalance);	// your code goes here

	}
}
