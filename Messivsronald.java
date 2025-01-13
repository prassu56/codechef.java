/*  40 30 50 10//input     equal//output   */
import java.util.*;
import java.lang.*;
import java.io.*;

class Messivsronald
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int c=2*a+b;
		int z=2*x+y;
        if(c>z){
            System.out.println("messi");
        }else if (c==z){
            System.out.println("equal");
        } else{
            System.out.println("ronaldo");
        }
	}
}