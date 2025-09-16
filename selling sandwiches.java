import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int sellingPrice = sc.nextInt();
		int bunCost = sc.nextInt();
		int vegiesCost = sc.nextInt();
		System.out.println(sellingPrice - (bunCost + vegiesCost));
		sc.close();
	}
}
