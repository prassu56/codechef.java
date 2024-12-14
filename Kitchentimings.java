import java.util.*;
class Kitchentimings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int workingHours = y - x;
            System.out.println(+workingHours);
	   }
	}
}

