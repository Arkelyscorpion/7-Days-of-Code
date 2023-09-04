import java.util.*;

public class day1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int c = 0;
        while (x > 0) {
            if (x % 2 == 1) {
                c++;
            }
            x /= 2;
        }
        System.out.println(c);
    }

}
