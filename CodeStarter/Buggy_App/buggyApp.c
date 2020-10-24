#include<stdio.h>

int digitSum(int n) {
    int sum = 0;
    while(n != 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

int main() {
    int hh, mm, num;
    scanf("%d %d", &hh, &mm);
    scanf("%d", &num);
    while(1) {
        num = digitSum(num);
        if(mm + 15 >= 60) {
            hh++;
            mm = 15 - (60 - mm);
        } else {
            mm += 15;
        }
        if(hh > 23) {
            printf("ERROR");
            break;
        }
        if(num < 10) {
            printf("%02d %02d", hh, mm);
            break;
        }
    }
    return 0;
}