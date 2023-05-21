#include <stdio.h>
int main(){
    int N;
    scanf("%d", &N);
    for(int i = N; i > 0; ){
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