import java.util.Scanner;
public final class Bacteria{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = 0;
        while(x>0){
            res += x % 2;
            x=x/2;
        }
        System.out.println(res);
    }
}