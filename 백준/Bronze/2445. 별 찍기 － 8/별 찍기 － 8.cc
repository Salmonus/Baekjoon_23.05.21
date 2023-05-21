#include <stdio.h>
int main(){
    int N;
    scanf("%d", &N);
    for(int i = 0; i < N;){
        i += 1;
        for(int x = 0; x < i; x++){
            printf("*");
        }
        for(int space = 0; space < N*2-i*2; space++){
            printf(" ");
        }
        for(int x = 0; x < i; x++){
            printf("*");
        }
        printf("\n");
    }
    for(int i = N - 1; i > 0;){
        for(int x = 0; x < i; x++){
            printf("*");
        }
        for(int space = 0; space < N*2-i*2; space++){
            printf(" ");
        }
        for(int x = 0; x < i; x++){
            printf("*");
        }
        printf("\n");
        i -= 1;
    }
}