import java.util.*;
import java.lang.*;
import java.io.*;

class Manapoints
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		     X=Y/X;
		    System.out.println(X);
		}

	}
}
