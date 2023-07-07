#include <stdio.h>

int main() {
    int M, P, L, E, R, S, N;
    while (scanf("%d %d %d %d %d %d %d", &M, &P, &L, &E, &R, &S, &N) != EOF) {
        for (int i = 0; i < N; i++) {
            int tempL = M * E;
            int tempM = P / S;
            P = L / R;
            L = tempL;
            M = tempM;
        }
        printf("%d\n", M);
    }
    return 0;
}
