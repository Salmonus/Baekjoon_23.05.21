#include <stdio.h>
int main(){
    int N, X, SOO;
    scanf("%d %d", &N, &X);
    for(int i = 0; i < N; i ++){
        scanf(" %d", &SOO);
        if(SOO < X){
            printf("%d ", SOO);
        }
    }
}