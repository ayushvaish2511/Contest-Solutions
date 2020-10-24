#include<stdio.h>

int main() {
    int q;
    scanf("%d", &q);
    while(q--) {
        long a, b, t;
        scanf("%ld %ld %ld", &a, &b, &t);
        long ans = 0;
        if(t % 2 == 0) {
            ans = (t / 2) * (a - b);
        } else {
            ans = (t / 2) * (a - b);
            ans += a;
        }
        printf("%ld\n", ans);
    }
    return 0;
}