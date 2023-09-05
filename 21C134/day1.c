#include <stdio.h>
 
int main()
{    
    int input;
    scanf("%d",&input);
    int res=0;
    
    while( input>0){
        res+=input%2;
        input=input/2;
    }
      
      printf("%d",res);
    return 0;
}