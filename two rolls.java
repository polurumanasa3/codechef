import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int currentPos = scanner.nextInt();
            int diceStart = scanner.nextInt(); 
            int neededSum = 50 - currentPos;
            int minSum = 2 * diceStart;
            int maxSum = 2 * (diceStart + 5);
            if (neededSum >= minSum && neededSum <= maxSum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();	// your code goes here

	}
}
