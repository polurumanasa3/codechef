import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        sc.close();

        String medal = getMedal(hours);
        System.out.println(medal);
    }

    public static String getMedal(int hours) {
        if (hours < 3) {
            return "GOLD";
        } else if (hours < 6) {
            return "SILVER";
        } else {
            return "BRONZE";
        }
	// your code goes here

	}
}
