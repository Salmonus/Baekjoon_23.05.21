#include<stdio.h>

int main() {
    int C, K, P, count=0;
    scanf("%d %d %d", &C, &K, &P);
    
    for (int i=1; i < C + 1; i++){
        count += K * i + P * (i * i);
    }
    
    printf("%d", count);
}