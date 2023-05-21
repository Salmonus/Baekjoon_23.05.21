#include<stdio.h>

int main() {
    double P, M,a,b;
    int a1, b1, A,B;
    scanf("%lf %lf", &P, &M);
    a = (P + M)/2;
    b = (P - M)/2;
    a1 = (P + M)/2;
    b1 = (P - M)/2;
    if(a == a1 && b == b1){
    if(P >= M){
        A = a; B = b;
        if(a >= b){
            printf("%d %d", A,B);   
        }else{
            printf("%d %d", B,A);
        }
    }else if(P < M){
        printf("-1");
    }}else{
        printf("-1");
    }
}