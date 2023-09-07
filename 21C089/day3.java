import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t > 0) {
            input.nextLine();

            int xA = input.nextInt();
            int yA = input.nextInt();
            int xB = input.nextInt();
            int yB = input.nextInt();
            int xF = input.nextInt();
            int yF = input.nextInt();

            int c = 0;
            c += Math.abs(xA - xB) + Math.abs(yA - yB);

            if (xA == xB && xA == xF && ((yA <= yF && yF <= yB) || (yA >= yF && yF >= yB))) {
                c += 2;
            }

            if (yA == yB && yA == yF && ((xA <= xF && xF <= xB) || (xA >= xF && xF >= xB))) {
                c += 2;
            }

            System.out.println(c);
            t--;
        }
    }
}
