/* 3
1 1 1/input     1/output
2 1 2           4
1 2 3           6 */
import java.util.*;
class Chefandchapters{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            int Y=s.nextInt();
            int Z=s.nextInt();
            System.out.println(X*Y*Z);
        }
    }
}