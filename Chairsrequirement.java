import java.util.*;
import java.lang.*;
import java.io.*;

class Chairsrequirement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		  int x=sc.nextInt();
		  int y=sc.nextInt();
		  if(x>y)
		  {
		      System.out.println(x-y);
		  }
		  else
		  {
		      System.out.println("0");
		  }
		}

	}
}
