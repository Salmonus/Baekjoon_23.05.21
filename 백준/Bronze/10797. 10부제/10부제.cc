#include <stdio.h>

int main() {
    int A, c=-1, n=0;
    scanf("%d\n", &A);
    for(int i=0; i < 6; i++){
        n = c == A ? n += 1 :n ;
        scanf("%d", &c); 
    }
    printf("%d", n);
    }