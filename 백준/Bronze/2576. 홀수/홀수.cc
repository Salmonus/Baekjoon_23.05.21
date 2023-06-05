#include <stdio.h>

int main() {
    int n, min=100, count=0;
    
    for(int i=0;i<7;i++){
        scanf("%d", &n);
        if(n % 2 != 0){
            count += n;
            if(n <= min){min = n;}
        }
        n = 0;
    }
    if(count == 0){printf("-1");}
    else{printf("%d\n%d\n", count, min);}
    return 0;
}