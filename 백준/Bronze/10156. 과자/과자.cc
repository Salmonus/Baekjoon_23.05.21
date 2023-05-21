#include<stdio.h>

int main() {
    int a, b;
    long c;
    scanf("%d %d %ld", &a, &b, &c);
    c = a * b - c;
    if(c < 0){c=0;}
    printf("%ld", c);
}