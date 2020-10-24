#include<stdio.h>

int main() {
    int n, x;
    scanf("%d %d", &n, &x);
    int a[n];
    int i, j;
    for(i=0;i<n;i++) {
        scanf("%d", &a[i]);
    }
    int count = 0;
    for(i=0;i<n;i++) {
        for(j=i+1;j<n;j++) {
            if(a[i] + a[j] == x) {
                count++;
            }
        }
    }
    printf("%d", count);
    return 0;
}