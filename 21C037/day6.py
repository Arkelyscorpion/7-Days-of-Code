t=int(input())
for i in range(t):
    a,b,x=[int(x) for x in input().split()]
    max=0
    for p in range(a,b+1):
        ans=(p//x)+(p%x)
        if(ans>=max):
            max=ans
    print(max)
