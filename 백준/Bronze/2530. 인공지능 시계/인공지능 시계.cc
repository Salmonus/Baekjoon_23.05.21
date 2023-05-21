#include<stdio.h>

int main() {
    int R,h,m,s;
    scanf("%d %d %d\n%d", &h,&m,&s,&R);
    h += m / 3600; m += R/60; s += R % 60;
    m += s / 60;
    h += m / 60;
    m = m % 60;
    h = h % 24;
    s = s % 60;
    printf("%d %d %d", h,m,s);
}