#include <stdio.h>

int main(){
    int A,B,C,D,E,T;
    scanf("%d %d %d %d %d", &A, &B, &C, &D, &E);
    if(A > 0){
        T = (B - A) * E;
    }else if(A == 0){
        T = (B - A) * E + D;
    }else{
        T = -1 * A * C + D + B * E;
    }
    printf("%d", T);
}