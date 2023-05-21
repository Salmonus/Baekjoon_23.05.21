#include<stdio.h>

int main() {
    int N,W,H,L,R;
    scanf("%d %d %d %d",&N,&W,&H,&L);
    R = (H/L) * (W/L);
    printf("%d", R >= N ? N : R);
}