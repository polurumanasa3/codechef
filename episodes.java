import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
          int n=sc.nextInt();
          int k=sc.nextInt();
          int hrs=0;
          int total=n*k;
          for(int i=0;i<k;i++)
          {
          if(total>=60)
          {
              hrs++;
              total-=60;
          }
          
          }
          System.out.print(hrs + " " + total);
          System.out.println();
      }	// your code goes here

	}
}
