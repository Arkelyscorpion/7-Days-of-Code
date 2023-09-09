#include <stdio.h>
int main() 
{
    int n, q;
    scanf("%d %d", &n, &q);
    long long arr[n];
    long long ps[n];
    for (int i = 0; i < n; i++) 
    {
        scanf("%lld", &arr[i]);
    }
    ps[0] = arr[0];
    for (int i = 1; i < n; i++) 
    {
        ps[i] = ps[i - 1] + arr[i];
    }

    for (int i = 0; i < q; i++) 
    {
        int a, b;
        scanf("%d %d", &a, &b);
        a--;
        b--;
        long long sum = (a == 0) ? ps[b] : ps[b] - ps[a - 1];
        printf("%lld\n", sum);
    }
    return 0;
}
