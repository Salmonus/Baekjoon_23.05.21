#include<stdio.h>

int main() {
    int T, A, B, C, max_val, other1, other2;
    
    scanf("%d", &T);
    
    for (int i = 1; i <= T; i++){
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
            printf("Scenario #%d:\nyes\n\n", i);
        }else{
            printf("Scenario #%d:\nno\n\n", i);
        }
    }
}