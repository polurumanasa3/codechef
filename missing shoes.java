import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
      int l = sc.nextInt();
      int r = sc.nextInt();
      int min = l-r ;
      if(l>r){
           System.out.println((min));
      }
      else{
      System.out.println((-min));
	}// your code goes here

	}
}
