import java.util.*;
import java.lang.*;
import java.io.*;

class Secondmaxofthreenumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int max = Math.max(a, Math.max(b, c));
            int secondMax = Math.min(Math.max(a, b), Math.max(Math.min(a, b), c));

            System.out.println(secondMax);
        }
		}

	}

