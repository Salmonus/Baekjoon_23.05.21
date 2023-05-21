#include<stdio.h>

int main() {
    long long int a, b, c;
    scanf("%lld %lld", &a, &b);
    c = a - b;
    if(c < 0){c=-c;}
    printf("%lld", c);
}