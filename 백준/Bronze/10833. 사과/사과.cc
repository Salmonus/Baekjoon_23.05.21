#include<stdio.h>

int main() {
    int T, N, A, count = 0;
    scanf("%d", &T);
    for(int i=0; i < T; i++){
        scanf("%d %d", &N, &A);
        if (N <= A){
            count += A % N;
        }else{
            count += A;
        }
    }
    printf("%d", count);
}