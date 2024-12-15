import java.util.*;
import java.lang.*;
import java.io.*;

class  Roller
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int x=sc.nextInt();
           int y=sc.nextInt();
           if(x<y)
           {
               System.out.println("NO");
           }
           else{
              System.out.println("YES"); 
           }
		}

	}
}
