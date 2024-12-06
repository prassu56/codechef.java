import java.util.*;
import java.lang.*;
import java.io.*;

public class Papercutting
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=s.nextInt();
		     int b=s.nextInt();
		      int c=(a/b)*(a/b);
		      System.out.println(c);
		}

	}
}

	

