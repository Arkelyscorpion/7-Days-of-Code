import java.util.Scanner;
public final class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int max=0,temp=0;
        for(int i=0; i<t; i++){
            long l=sc.nextLong();
            long r=sc.nextLong();
            long a=sc.nextLong();
            for(long j=l; j<=r;j++){
                temp= (int) (Math.floor(j/a)+(j%a));
                if(temp>max){
                    max=temp;
                }
            }
            System.out.println(max);
            max=0;
            temp=0;
        }
    }
}