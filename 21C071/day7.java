import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline after reading t
 
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            sc.nextLine(); // Consume the newline after reading n
            String l = sc.nextLine();
 
            String s = "" + Character.toLowerCase(l.charAt(0));
 
            for (int i = 0; i < l.length() - 1; i++) {
                if (Character.toLowerCase(l.charAt(i)) == Character.toLowerCase(l.charAt(i + 1))) {
                    continue;
                } else {
                    s += Character.toLowerCase(l.charAt(i + 1));
                }
            }
 
            if (s.equals("meow")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}