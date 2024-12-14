import java.util.*;
   class  Donationdrive{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int remainingDonations = n - x;
            System.out.println(+ remainingDonations);
        }
        
    }
}
