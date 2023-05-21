#include <stdio.h>

int main() {
    int a,b,c,d,e,f;
    scanf("%d\n%d", &a, &b);
    c = a * (b % 10);
    d = a * (((b % 100) - (b % 10))/10);
    e = a * ((b - (b % 100))/100);
    f = c + d*10 + e*100;
    printf("%d\n%d\n%d\n%d", c,d,e,f);
}