#include<stdio.h>
#include<stdbool.h>
int main()
{   int n=0,b;
    bool a=true;
    scanf("%d",&n);
    int min=1;
    if(min*2>=n)
        printf("%d",min);
    else
        while(a!=false){
             b=min;
             min=min*2;
             if(min>n){
                a=false;
                b=n-b+1;
                printf("\n%d",b);}
            if(min==n){
                printf("1");
                a=false;
}}}
