import java.util.Scanner;

public final class Main {
    static boolean checkString(String str){
        int len = str.length();
        char[] arr = str.toCharArray();

        if(len == 1){
            return false;
        }

        if(arr[0] != arr[1] || arr[len-2] != arr[len-1]){
            return false;
        }

        for(int i=1; i<len-1; i++){
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            String str = scanner.next();
            System.out.println(checkString(str));
        }
    }
}