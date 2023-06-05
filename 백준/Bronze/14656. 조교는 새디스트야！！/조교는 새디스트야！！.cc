#include <stdio.h>

int main(){
    int num, n, count=0;
    scanf("%d", &num);
    for(int i=1; i < num + 1; i++){
        scanf("%d", &n);
        if(i != n) count += 1;
    }
    printf("%d", count);
}