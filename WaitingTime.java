import java.util.*;
import java.lang.*;
import java.io.*;

class WaitingTime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int K=sc.nextInt();
		int X=sc.nextInt();
		 int totalDays = K * 7;
        int remainingDays = totalDays - X;
        System.out.println(remainingDays);
}
	}
}
