#include<stdio.h>

int main() {
    int a, b, T;
    
    scanf("%d", &T);
    for (int l = 0; l < T; l++){
        long long res = 1;
        scanf("%d %d", &a, &b);
        a = a % 10;
        if (a == 0){
            printf("10\n");
        }else if (b == 0){
            printf("1\n");
        }else{
            b = b % 4 + 4;
            for (int i=0; i < b; i++){
                res *= a;
                res = res % 10;
            }
            printf("%d\n", res);
        }
    }
    return 0;
}
