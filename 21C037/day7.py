
t=int(input())
s=""
for j in range(t):
    n=int(input())
    l=list(input())
    index=0
    s=""+l[0].lower()
    for i in range(len(l)-1):
        if(l[i].lower()==l[i+1].lower()):
            continue
        else:
            s+=l[i+1].lower()

    if(s=="meow"):
        print("YES")
    else:
        print("NO")
        
    

