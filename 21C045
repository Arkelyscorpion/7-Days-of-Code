#include<stdio.h>
#include<math.h>
int f=0;
int bac(int a,int i){
	if(pow(2,i)==a){
		return 0; 
	}else if(pow(2,i)<a){
		bac(a,i+1);
	}else{
		return a-pow(2,i-1);
	}
}
int data(int a){
	int i=0;
	f+=1;
	a=bac(a,i);
	if(a!=0){
		data(a);
	}
}
int main(){
	int b,a,i,j;
	printf("Enter the number of bacteria : ");
	scanf("%d",&a);
	data(a);
	printf("%d",f);
}
