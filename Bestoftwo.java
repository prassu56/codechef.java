import java.util.*;
import java.lang.*;
import java.io.*;

class Bestoftwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scanner = new Scanner(System.in);
       
        int t = scanner.nextInt();

        while (t-- > 0) {
          
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int finalScore = Math.max(x, y);
            System.out.println( + finalScore);
        }

	}
}
