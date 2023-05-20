#include <stdio.h>
int main(){
    int x, y;
    int count;
    scanf("%d\n", &count);
    for(int i = 0 ; i != count; i++){
        scanf("%d\n", &x);
        scanf("%d\n", &y);
        printf("%d\n", x + y);
        }
    }