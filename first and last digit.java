import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 char[] numbers;
        int cases, sum;
        final Scanner scanner = new Scanner(System.in);
        cases = scanner.nextInt();
        while (cases-- > 0) {
            numbers = String.valueOf(scanner.nextInt()).toCharArray();
            sum = 0;
            sum += numbers[0] - '0';
            sum += numbers[numbers.length - 1] - '0';
            System.out.println(sum);
        }
        scanner.close();	// your code goes here

	}
}
