#include<stdio.h>

int main() {
    double A,B,C,a,b,R;
    scanf("%lf %lf %lf", &A, &B, &C);
    a = A * B / C;
    b = A / B * C;
    R = a >= b ? a : b;
    int N = R;
    printf("%d", N);
}