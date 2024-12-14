import java.util.*;
class Placementtest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int n = scanner.nextInt();
            int pointsPerTestCase = x / 10;
            int score = n * pointsPerTestCase;
            System.out.println(+score);
        }
	}
}