import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in=new Scanner(System.in);
		// your code goes here
		int R1,R2,D1,D2;
		int s=0,c=0;
		R1=in.nextInt();
			R2=in.nextInt();
				D1=in.nextInt();
					D2=in.nextInt();
					s=R1+D1;
					c=R2+D2;
					if(s>c)
					System.out.println("Dominater");
					else
					System.out.println("Everule");
					s=0;
					c=0;
						// your code goes here

	}
}
