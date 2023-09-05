n = int(input())
bact = 0
while(n>0):
    if(n%2==0):
        n=n//2
    else:
        n=(n-1)//2
        bact = bact + 1
print(bact)
