import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int Y=s.nextInt();
		int Z=2*X;
		if(Z<Y){
		    System.out.println("PLASTIC");
		}
		else{
		    System.out.println("METAL");
		}

	}
}
