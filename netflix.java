import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
            int testcase= sc.nextInt();
            while(testcase-->0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int x=sc.nextInt();
                if(a+b>=x || b+c>=x || a+c>=x) {
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }

                }	// your code goes here

	}
}
