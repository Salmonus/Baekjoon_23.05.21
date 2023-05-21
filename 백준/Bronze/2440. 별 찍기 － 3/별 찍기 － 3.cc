#include <stdio.h>
int main(){
    int N;
    scanf("%d", &N);
    for(int i = N; i > 0; ){
        for(int x = 0; x < i; x++){
            printf("*");
        }
        if(i != 0){printf("\n");}
        i -= 1;
    }
}