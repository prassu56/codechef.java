import java.util.*;
class Bone
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int totalTreats = (n * x) + (m * y);
        System.out.println(+ totalTreats);

	}
}
