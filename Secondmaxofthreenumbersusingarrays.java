import java.util.*;
public class Secondmaxofthreenumbersusingarrays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0) {
            int[] numbers = new int[3];
            for (int i = 0; i < 3; i++) {
                numbers[i] = scanner.nextInt();
            }
            Arrays.sort(numbers);
            System.out.println(numbers[1]);
        }
    }
}