import java.util.*;
public class Determinethescore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int n = scanner.nextInt();

            int scorePerTestCase = x / 10;
            int totalScore = scorePerTestCase * n;

            System.out.println(totalScore);
        }

        scanner.close();
    }
}

