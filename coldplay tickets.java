import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();

        int totalPeople = N + 1;
        
        int ticketCost = 5000;
        
        int totalCost = totalPeople * ticketCost;
        System.out.println(totalCost);
        
        
        scanner.close();	// your code goes here

	}
}
