import java.util.*;
import java.lang.*;
import java.io.*;

class Bidding
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int Alice=sc.nextInt();
		int Bob=sc.nextInt();
		int Charlie=sc.nextInt();
		if(Alice>Bob&&Alice>Charlie)
		{
		    System.out.println("Alice");
		}
		else if(Bob>Alice&&Bob>Charlie)
		{
		    System.out.println("Bob");
		}
		else{
		    System.out.println("Charlie");
		}
}
	}
}
