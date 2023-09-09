import bisect
n=int(input())
l=[int(x) for x in input().split()]
k=int(input())
l.sort()
for i in range(k):
    p=int(input())
    cnt = bisect.bisect_right(l, p)
    print(cnt)
