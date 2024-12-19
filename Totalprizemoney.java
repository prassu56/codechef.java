import java.util.*;
import java.lang.*;
import java.io.*;

class Totalprizemoney
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            long totalPrizeMoney = calculateTotalPrizeMoney(x, y);
            System.out.println(totalPrizeMoney);
        }
	}
    private static long calculateTotalPrizeMoney(int x, int y) {
        // Top 10 participants receive x each
        long top10PrizeMoney = 10L * x;

        // Participants with rank 11 to 100 receive y each
        long remainingPrizeMoney = 90L * y;

        return top10PrizeMoney + remainingPrizeMoney;
    }	

	}

