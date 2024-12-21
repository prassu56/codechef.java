import java.util.*;
import java.lang.*;
import java.io.*;

class Countingwords
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		int N=sc.nextInt();
		int M=sc.nextInt();
		System.out.println(+(N*M));
		}
	}
}
