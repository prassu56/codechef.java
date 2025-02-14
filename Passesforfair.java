import java.util.*;
import java.lang.*;
import java.io.*;

class Passesforfair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int K=sc.nextInt();
		    int N=sc.nextInt();
		    if(N>K)
		    {
		        System.out.println("YES");
		    }
		    else{
		      System.out.println("NO");   
		    }
		}

	}
}
