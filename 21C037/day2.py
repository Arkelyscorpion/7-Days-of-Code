n=int(input())
for i in range(n):
    s=input()
    for i in range(1,len(s)-1):
        if(s[i-1]!=s[i] and s[i]!=s[i+1]):
            print("NO")
            break
    else:
        if(len(s)==1 or s[0]!=s[1] or s[-1]!=s[-2]):
            print("NO")
        else:
            print("YES")
