import java.util.Scanner;

public class Reachthetarget{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int runsNeeded = x - y;

            System.out.println(runsNeeded);
        }

        scanner.close();
    }
}
