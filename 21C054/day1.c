#include<stdio.h>
#include<stdbool.h>
int main()
{
    int n=0,last;
    bool loop=true;
    scanf("%d",&n);
    int min=1;
    if(min*2>=n)
        printf("%d",min);
    else
        while(loop!=false){
             last=min;
             min=min*2;
             if(min>n){
                loop=false;
                last=n-last+1;
                printf("\n%d",last);}
            if(min==n){
                printf("1");
                loop=false;}
        }
             
}
