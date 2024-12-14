import java.util.*;
class Ipl
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int M=sc.nextInt();
	        int N=sc.nextInt();
	        int x=Math.max(0,M-N);
	         System.out.println(+x);
	    }
	  
	}
}

