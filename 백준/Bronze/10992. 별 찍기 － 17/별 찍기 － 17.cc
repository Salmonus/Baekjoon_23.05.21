#include<stdio.h>

int main() {
    int N;
    scanf("%d", &N);
    if(N ==1) printf("*");
    N -= 1;
    for(int i = 0; i < N;){
        i += 1;
        for(int x = 0; x < N-i+1; x++){
            printf(" ");
        }
        printf("*");
        for(int s = 0; s < (i - 1)*2 -1; s ++){
            printf(" ");
        }
        if(i != 1) printf("*");
        printf("\n");
        if(i == N){
            for(int a= 0; a < N*2+1; a++){
                printf("*");
            }
        }
    }
}