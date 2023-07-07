#include<stdio.h>

int main() {
    int A, B, C, max_val, other1, other2;
    
    while (1){
        scanf("%d %d %d", &A, &B, &C);
        if (A == 0 && B == 0 && C == 0){
            break;
        }
        
        if ((A > B) && (A > C)){
            max_val = A;
            other1 = B;
            other2 = C;
        }else if ((B > A) && (B > C)){
            max_val = B;
            other1 = A;
            other2 = C;
        }else{
            max_val = C;
            other1 = A;
            other2 = B;
        }
        
        if (max_val * max_val == other1 * other1 + other2 * other2){
            printf("right\n");
        }else{
            printf("wrong\n");
        }
    }
}