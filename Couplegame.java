import java.util.*;
import java.lang.*;
import java.io.*;

class Couplegame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int G=sc.nextInt();
		    int B=sc.nextInt();
		    int C=B-G;
		    System.out.println(C);
		}
	}
}
