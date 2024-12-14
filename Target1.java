import java.util.*;
import java.lang.*;
import java.io.*;

class Target1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int Z=X-Y;
		System.out.println(+Z);
		}
	}
}
