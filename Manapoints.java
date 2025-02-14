/* 3
10 30/input       3/output
6 41              6
50 2              0      */
import java.util.*;
import java.lang.*;
import java.io.*;

class Manapoints
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            int Y=s.nextInt();
            X=Y/X;
            System.out.println(X);
        }
	}
}