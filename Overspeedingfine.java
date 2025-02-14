import java.util.*;
import java.lang.*;
import java.io.*;

class Overspeedingfine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int X=sc.nextInt();
		    if(X<=70)
		    {
		        System.out.println("0");
		    }
		    else if(X>70&&X<=100)
		    {
		        System.out.println("500");
		    }
		    else{
		        System.out.println("2000");
		    }
		}

	}
}
