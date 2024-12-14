import java.util.*;
class Reachontime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
      
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();

            if (x >= 30) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

	}
}
