#include <stdio.h>

int main() {
    int a, c=-2, i=60;
    scanf("%d", &a);
    while(i != 0){
        a = a == 100 ? 99 : a;
        i = a >= i ? i += 10 : 0;
        c += 1;
    }
    printf("%c", c = c > -1 ? 68-c : 70);
    }