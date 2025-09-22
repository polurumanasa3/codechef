import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int evenDivisors = 0;
            int oddDivisors = 0;
            
            // Loop to find all divisors of N
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    if (i % 2 == 0) {
                        evenDivisors++;
                    } else {
                        oddDivisors++;
                    }
                }
            }
            
            // Compare the count of even and odd divisors
            if (evenDivisors > oddDivisors) {
                System.out.println(1);
            } else if (evenDivisors == oddDivisors) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
        
        scanner.close();	// your code goes here

	}
}
