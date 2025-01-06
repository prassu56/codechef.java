/*   2//input   GOLD//output     */
import java.util.*;
class OctoberMarathon{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        if(X<3){
            System.out.println("GOLD");
        }else if(X>=3 && X<6 ){
            System.out.println("SILVER");
        }else{
            System.out.println("BRONZE");
        }
    }
}