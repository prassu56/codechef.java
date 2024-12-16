import java.util.*;

class Chefondate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Read the amount of money Chef has and the bill amount
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Check if Chef has enough money to pay the bill
            if (X >= Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}