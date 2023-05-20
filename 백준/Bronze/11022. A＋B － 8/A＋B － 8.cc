#include <stdio.h>
int main(){
    int x, y;
    int count;
    scanf("%d\n", &count);
    for(int i = 1 ; i != count + 1; i++){
        scanf("%d ", &x);
        scanf("%d\n", &y);
        printf("Case #%d: %d + %d = %d\n", i, x, y, x + y);
        }
    }