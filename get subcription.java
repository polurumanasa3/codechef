import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    String subOrNot(int minutes)
    {
        if(minutes <= 30)
        {
            return "No";
        }
        else
        {
            return "Yes";    
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		Codechef cc = new Codechef();
		int t = scan.nextInt();
		for(int i = 0; i<t; i++)
		{
		    int minutes = scan.nextInt();
		    System.out.println(cc.subOrNot(minutes));
		}
	}
}
