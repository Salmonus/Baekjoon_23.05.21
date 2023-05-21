#include <stdio.h>
int main(){
    int N;
    scanf("%d", &N);
    for(int i = 0; i < N; ){
        i += 1;
        for(int y = 0; y < N - i; y ++){
            printf(" ");
        }
        for(int x = 0; x < 2*i - 1; x++){
            printf("*");
        }
        printf("\n");
    }
    for(int i = N-1; i > 0; ){
        for(int y = 0; y < N - i; y ++){
            printf(" ");
        }
        for(int x = 0; x < 2*i - 1; x++){
            printf("*");
        }
        printf("\n");
        i -= 1;
    }
}