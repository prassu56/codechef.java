import java.util.*;
import java.lang.*;
import java.io.*;

class Parity
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int X=sc.nextInt();
        if(X%2==0)
        {
            System.out.println("YES");
        }
		
        else{
            System.out.println("NO");
        }
	}
}
}