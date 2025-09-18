import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here



        Scanner scn = new Scanner(System.in);

            int A = scn.nextInt();
            
            if(A % 3 == 0){
                System.out.println(A);
            }else{
                if(A % 3 == 2){
                    System.out.println(A + 1);
                }else if(A % 3 == 1){
                    System.out.println(A - 1);
                }else{
                    System.out.println(0);
                }
                
                
            }
            
        


    }
}