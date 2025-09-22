import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++){
		    int x = read.nextInt();
		    int y = read.nextInt();
		    int z = read.nextInt();
		    if((z-(y/x))>=0){
		        System.out.println(z-(y/x));
		    }
		    else{
		        System.out.println(0);
		    }
		}	// your code goes here

	}
}
