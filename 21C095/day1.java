import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bacteriaAdded = 0;

        while (n > 0) {
            bacteriaAdded += n % 2;
            n /= 2;
        }

        System.out.println(bacteriaAdded);
    }
}