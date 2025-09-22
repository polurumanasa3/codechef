import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        // Loop through each test case
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // The number to check
            int oddCount = 0, evenCount = 0;

            // Check every number from 1 to N
            for (int j = 1; j <= N; j++) {
                if (N % j == 0) { // j is a divisor
                    if (j % 2 == 0) {
                        evenCount++; // Even divisor
                    } else {
                        oddCount++; // Odd divisor
                    }
                }
            }

            // Output result
            System.out.println(oddCount + " " + evenCount);
        }

        scanner.close();	// your code goes here

	}
}
