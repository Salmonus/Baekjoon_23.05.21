#include <stdio.h>

int main() {
    int n, num, a, count=0;
    scanf("%d", &n);
    for(int i=0;i<n;i++){
            scanf("%d", &num);
            for(int y=0; y<num;y++){
                scanf("%d", &a);
                count += a;
            }
            printf("%d\n", count);
            count = 0;
        }
    
    return 0;
}