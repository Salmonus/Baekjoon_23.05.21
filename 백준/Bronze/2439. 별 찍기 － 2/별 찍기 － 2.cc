#include <stdio.h>
int main(){
    int N;
    scanf("%d", &N);
    for(int i = 0; i < N; ){
        i += 1;
        for(int y = 0; y < N - i; y ++){
            printf(" ");
        }
        for(int x = 0; x < i; x++){
            printf("*");
        }
        printf("\n");
    }
}