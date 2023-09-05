#include<stdio.h>
#include<conio.h>
int main()
{
    int n,count=0;
    scanf("%d",&n);
    while(n>0)
    {
        if(n%2==1)
        {
            n--;
            count++;
        }
        else
        {
            n=n/2;
        }
    }
    printf("%d",count);
}