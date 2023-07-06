#include<stdio.h>

int main() {
    int H, W, N, T;
    scanf("%d", &T);
    for (int i=0; i < T; i++){
        scanf("%d %d %d", &H, &W, &N);
        int last = N % H ? N / H + 1 : N / H;
        int first = N % H ? N % H : H;
        printf("%d\n", first * 100 + last);
    }
    return 0;
}
