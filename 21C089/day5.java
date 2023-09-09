import java.util.*;

public class day5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] pr = new int[n];
        for (int i = 0; i < n; i++) {
            pr[i] = input.nextInt();
        }
        Arrays.sort(pr);
        int q = input.nextInt();
        int[] days = new int[q];
        for (int i = 0; i < q; i++) {
            days[i] = input.nextInt();
        }
        int[] ns = new int[q];
        for (int i = 0; i < q; i++) {
            int left = 0;
            int right = n - 1;
            int ct = 0;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (pr[mid] <= days[i]) {
                    ct = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            ns[i] = ct;
        }
        for (int s : ns) {
            System.out.println(s);
        }
    }
}
