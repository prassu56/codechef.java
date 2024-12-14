import java.util.*;
class Audiblerange
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int x=sc.nextInt();
	     if(x>=67&&x<=45000)
	     {
	         System.out.println("yes");
	     }
	     else
	     {
	         System.out.println("no");
	     }
	 }

	}
}
