import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner myObj=new Scanner(System.in);
		int T = myObj.nextInt();
		for(int i=0;i<T;i++){
		    int X = myObj.nextInt();
		    if(X%3==0){
		        System.out.println("NORMAL");
		    }else if(X%3==1){
		        System.out.println("Huge");
		    }else{
		        System.out.println("Small");
		    }
		}	// your code goes here

	}
}
