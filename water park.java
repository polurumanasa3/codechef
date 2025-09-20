import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight and height
        int weightLimit = scanner.nextInt();
        int heightRequirement = scanner.nextInt();

        // Chef's weight and height
        int chefWeight = 60;
        int chefHeight = 130;

        // Check if Chef can enter the water slide
        if (chefWeight <= weightLimit && chefHeight >= heightRequirement) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
