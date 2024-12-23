import java.util.*;
import java.lang.*;
import java.io.*;

class Sumit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=A+B;
		    int D=sc.nextInt();
		    if(C==D)
		    {
		        System.out.println("YES");
		    }
		    else{
		         System.out.println("NO");
		    }
		}

	}
}
