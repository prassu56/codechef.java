/* 4
30//input  YES//output
23         NO
60         YES
24         NO    */

import java.util.*;
import java.lang.*;
import java.io.*;

class Justonemoreepisode
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0; i<t; i++)
		{
		int x=sc.nextInt();
		if(x>24)
		System.out.println("YES");
		else
		System.out.println("NO");
		}

	}
}