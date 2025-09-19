import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        int x=sc.nextInt();
	        int cuboid=a*b*c;
	        int cube=(int)Math.pow(x,3);
	        if(cuboid>cube){
	            System.out.println("Cuboid");
	        }
	        else if(cuboid==cube){
	            System.out.println("Equal");
	        }else{
	            System.out.println("Cube");
	        }	// your code goes here

	}
}
