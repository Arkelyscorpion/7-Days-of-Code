import java.util.Scanner;
 
public final class Grid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		long xa,ya,xb,yb,fa,fb,a,b,m=0,n=0;
		for(int i=0; i<t; i++){
			xa = sc.nextLong();
			xb = sc.nextLong();
			ya = sc.nextLong();
			yb = sc.nextLong();
			fa = sc.nextLong();
			fb = sc.nextLong();
        		a = Math.abs(xa-ya);
			b = Math.abs(xb-yb);
			if(xa==ya){
				if(xa==fa){
					if(xb>yb){
						m=xb;
						n=yb;
					}
					else{
					    m=yb;
					    n=xb;
					}
					if(fb<m && fb>n){
					    a=2;
					}
				}
			}
			if(xb==yb){
			    if(xb==fb){
			        if(xa>ya){
			            m=xa;
			            n=ya;
			        }
			        else{
			            m=ya;
			            n=xa;
			        }
			        if(fa<m && fa>n){
			            b=2;
			        }
			    }
			}
			if(xa==ya && xb==yb){
			    a=0;
			    b=0;
			}
			System.out.println(a+b);
		}
	}
}