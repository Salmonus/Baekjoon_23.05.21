#include <stdio.h>

int main(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    if(b < c) printf("%d", a / (c - b) + 1);
    else printf("-1");
}