import java.util.*;

public class day2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        for (int i = 0; i < t; i++) {
            String s = input.nextLine();
            boolean op = true;
            int n = s.length();
            for (int j = 1; j < n - 1; j++) {
                if (s.charAt(j - 1) != s.charAt(j) && s.charAt(j) != s.charAt(j + 1)) {
                    op = false;
                    break;
                }
            }
            if (n == 1 || s.charAt(0) != s.charAt(1) || s.charAt(n - 1) != s.charAt(n - 2)) {
                op = false;
            }
            if (op) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}