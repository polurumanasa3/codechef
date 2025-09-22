import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 

            boolean isGood = true;
            for (int j = 0; j < n; j++) {
                int score = scanner.nextInt();
                if (score <= 4) {
                    isGood = false;
                }
            }
            
            if (isGood) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();	// your code goes here

	}
}
