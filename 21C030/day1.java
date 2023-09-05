import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int finalbac = 0;

        while (n > 0) {
            finalbac += n % 2;
            n /= 2;
        }

        System.out.println(finalbac);
    }
}