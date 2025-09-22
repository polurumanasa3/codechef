import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Loop for each test case
        while (t-- > 0) {
            // X = total budget for the month
            // Y = daily expenses
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Calculate total monthly expense (30 days)
            int exp = Y * 30;

            // Check if the budget is enough
            if (X >= exp)
                // Budget is sufficient
                System.out.println("YES");
            else
                // Budget is insufficient
                System.out.println("NO");	// your code goes here

	}
}
}