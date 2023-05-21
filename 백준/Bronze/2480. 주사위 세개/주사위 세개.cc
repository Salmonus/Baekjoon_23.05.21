#include<stdio.h>

int main() {
    int a,b,c,R;
    scanf("%d\n%d\n%d", &a, &b, &c);
    if(a==b && b==c && c==a){
        printf("%d", 10000 + 1000*a);
    }else if(a==b && b != c || c==a && a != b){
        printf("%d", 1000 + 100*a);
    }else if(b==c && c!=a){
        printf("%d", 1000 + 100*b);
    }else{
        if(a - b > 0 && a - c > 0){
            printf("%d", 100*a);
        }else if(b - a > 0 && b - c > 0){
            printf("%d", 100*b);
        }else if(c - a > 0 && c - b > 0){
            printf("%d", 100*c);
        }
    }
}