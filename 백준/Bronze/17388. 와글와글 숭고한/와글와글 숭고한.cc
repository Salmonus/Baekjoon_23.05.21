#include<stdio.h>

int main() {
    int S,K,H;
    scanf("%d %d %d",&S,&K,&H);
    if(S + K + H >= 100){
        printf("OK");
    }else{
        if(S < K && S < H){printf("Soongsil");}
        if(K < S && K < H){printf("Korea");}
        if(H < S && H < K){printf("Hanyang");}
    }
}