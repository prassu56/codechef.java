import java.util.*;
import java.lang.*;
import java.io.*;

class twoknotes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int notesNeeded = (n * 2000) / 500;
        System.out.println(+ notesNeeded);
	}
}

