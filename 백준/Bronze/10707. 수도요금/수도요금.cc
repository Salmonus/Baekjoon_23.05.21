#include<stdio.h>

int main() {
    int A,B,C,D,P,X,Y;
    scanf("%d\n%d\n%d\n%d\n%d", &A, &B, &C, &D, &P);
    X = A * P;
    Y = P <= C ? B : B + D * (P - C);
    printf("%d", X >= Y ? Y : X);
}