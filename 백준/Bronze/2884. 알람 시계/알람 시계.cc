#include<stdio.h>

int main() {
    int H, M;
    scanf("%d %d", &H, &M);
    
    if (M < 45){
        H = H > 0 ? H - 1 : 23;
        M += 15;
    }else{
        M -= 45;
    }
    
    printf("%d %d", H, M);
}