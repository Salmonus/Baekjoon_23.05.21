#include<stdio.h>

int main() {
    int n, count=0, winner=0, max=0;
    for(int i=0; i < 5; i++){
        for(int x=0; x < 4; x++){
            scanf("%d", &n);
            count += n;
        }
        if(count > max){winner = i + 1;max = count;}
        count = 0;
    }
    printf("%d %d", winner, max);
}