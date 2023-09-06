import java.util.Scanner;
public final class StringChecker{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        String str ="";
        char A='a';
        char B='b';
        for(int i=0; i<t; i++){
            str = sc.next();
            if(str.length()==1){
                System.out.println("NO");
                continue;
            }
            for(int j=0; j<str.length();j++){
                //checking 1st letter
                if(j==0 && str.charAt(j)==A){
                    if(str.charAt(j+1)==A){
                        continue;
                    }
                    else{
                        System.out.println("NO");
                        break;
                    }
                }
                if(j==0 && str.charAt(j)==B){
                    if(str.charAt(j+1)==B){
                        continue;
                    }
                    else{
                        System.out.println("NO");
                        break;
                    }
                }
                //checking last letter
                if(j==str.length()-1 && str.charAt(j)==A){
                    if(str.charAt(j-1)==A){
                        System.out.println("YES");
                        continue;
                    }
                    else{
                        System.out.println("NO");
                        break;
                    }
                }
                if(j==str.length()-1 && str.charAt(j)==B){
                    if(str.charAt(j-1)==B){
                        System.out.println("YES");
                        continue;
                    }
                    else{
                        System.out.println("NO");
                        break;
                    }
                }
                //checking middle letters
                if(str.charAt(j)==A){
                    if(str.charAt(j+1)==A || str.charAt(j-1)==A){
                        continue;
                    }
                    else{
                        System.out.println("NO");
                        break;
                    }
                }
                if(str.charAt(j)==B){
                    if(str.charAt(j+1)==B || str.charAt(j-1)==B){
                        continue;
                    }
                    else{
                        System.out.println("NO");
                        break;
                    }
                }
               
            }
        }
    }
}