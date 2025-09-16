import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();  // silver coins
        int B = sc.nextInt();  // gold coins
        
        // Each gold coin can be traded for 2 silver coins
        int totalMoney = A + (2 * B);
        
        System.out.println(totalMoney);
        
        sc.close();
    }
}
