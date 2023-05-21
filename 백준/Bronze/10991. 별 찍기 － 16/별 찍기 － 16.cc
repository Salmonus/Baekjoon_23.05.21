#include<stdio.h>

int main() {
    int N;
    scanf("%d", &N);
    for(int i = 0; i < N;){
        for(int x = 0; x < N-i -1; x++){
            printf(" ");
        }
        printf("*");
        for(int s = 0; s < i; s ++){
            printf(" ");
            printf("*");
        }
        printf("\n");
        i += 1;
    }
}