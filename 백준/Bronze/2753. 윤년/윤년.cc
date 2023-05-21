#include <stdio.h>

int main() {
    int A, n=0;
    scanf("%d\n", &A);
    if(A % 4 == 0 && A % 100 != 0){printf("1");}
    else if(A % 400 == 0){printf("1");}
    else{printf("0");}
}