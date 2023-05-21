#include <stdio.h>

int main() {
    int H, M, C, h, m;
    scanf("%d %d\n%d", &H, &M, &C);
    if(M + C >= 60){
        h= H + (M + C)/60;
        h= h >= 24 ? h-24: h;
        m= (M + C - 60) % 60;
        printf("%d %d", h, m);
        
    }else{printf("%d %d", H, M + C);}
}