#include <stdio.h>

int main(){
    int N, M, K, O, X;
    scanf("%d %d %d", &N, &M, &K);
    O = M >= K ? K : M;
    X = K >= M ? N - K : N - M; 
    printf("%d", O + X);
}