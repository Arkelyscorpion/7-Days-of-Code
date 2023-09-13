
import java.util.*;

public class day6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int x = input.nextInt();
            int max = 0;

            for (int j = a; j <= b; j++) {
                int as = (j / x) + (j % x);
                if (as >= max) {
                    max = as;
                }
            }

            System.out.println(max);
        }
    }
}