import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		    int AliceMarks = sc.nextInt();
			int BobMarks = sc.nextInt();
			if(AliceMarks>=2*BobMarks) 
			{
				System.out.println("YES");
			}else 
			{
				System.out.println("NO");
			}
	}
}
