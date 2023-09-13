import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        for (int j = 0; j < t; j++) {
            int n = input.nextInt();
            input.nextLine();
            String l = input.nextLine().toLowerCase();
            StringBuilder s = new StringBuilder();
            s.append(l.charAt(0));

            for (int i = 0; i < n - 1; i++) {
                if (Character.toLowerCase(l.charAt(i)) != Character.toLowerCase(l.charAt(i + 1))) {
                    s.append(Character.toLowerCase(l.charAt(i + 1)));
                }
            }

            if (s.toString().equals("meow")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
