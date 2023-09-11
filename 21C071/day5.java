import java.util.Arrays;
import java.util.Scanner;
 
public final class InterestingDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int shop[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            shop[i] = sc.nextInt();
        }
        
        Arrays.sort(shop);
        
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            int coins = sc.nextInt();
            int left = 0, right = n - 1;
            int count = 0;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (shop[mid] <= coins) {
                    count = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            System.out.println(count);
        }
    }
}