t=int(input())
for i in range(t):
    input()
    x1,y1=[int(x) for x in input().split()]
    x2,y2=[int(x) for x in input().split()]
    f3,fy3=[int(x) for x in input().split()]
    
    cnt=0
    cnt+=abs(x1-x2)+abs(y1-y2)
    if(x1==x2==f3 and (y1<=fy3<=y2 or y1>=fy3>=y2)):
        cnt+=2
    if(y1==y2==fy3 and (x1<=f3<=x2 or x1>=f3>=x2)):
        cnt+=2
    print(cnt)
