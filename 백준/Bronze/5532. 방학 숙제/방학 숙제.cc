#include<stdio.h>

int main() {
    int A,B,C,D,L,G,M;
    scanf("%d\n%d\n%d\n%d\n%d",&L,&A, &B, &C, &D);
    M = B % D == 0 ? B / D : B / D + 1;
    G = A % C == 0 ? A / C : A / C + 1;
    printf("%d", L - (M >= G ? M : G));
}