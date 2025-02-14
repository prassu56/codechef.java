/*  4
1//input    LIGHT//output
20          HEAVY
3           MODERATE
7           HEAVY   */
import java.util.*;
class Raininchefland{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            if(X<3){
                System.out.println("LIGHT");
            }else if(X>=3 && X<7){
                System.out.println("MODERATE");
            }else{
                System.out.println("HEAVY");
            }
        }
    }
}