#include <stdio.h>

int main(){
    int N, M;
    scanf("%d %d", &N, &M);
    if(M <= 2){
        printf("NEWBIE!");
    }else if(2 < M && M <= N){
        printf("OLDBIE!");
    }else{
        printf("TLE!");
    }
}