#include<stdio.h>

int main() {
    int T, A, M=0, N=0;
    
    scanf("%d", &T);
    
    for (int i = 0; i < T; i++){
        scanf("%d", &A);
        N += (A / 30 + 1) * 10;
        M += (A / 60 + 1) * 15;
    }
    if (M < N) {
        printf("M %d\n", M);
    } else if (M > N) {
        printf("Y %d\n", N);
    } else {
        printf("Y M %d\n", M);
    }
    return 0;
}
