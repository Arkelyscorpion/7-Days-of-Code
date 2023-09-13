import java.util.Scanner;
public final class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            long l=sc.nextLong();
            long r=sc.nextLong();
            long a=sc.nextLong();
            if(l/a == r/a){
                System.out.println(r/a+r%a);
            }
            else{
                System.out.println(Math.max(r/a+ r%a, r/a -1 + a-1));
            }
        }
    }
}