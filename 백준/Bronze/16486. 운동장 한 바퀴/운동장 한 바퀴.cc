#include <stdio.h>

int main(){
    float d1, d2, R, pi = 3.141592;
    scanf("%f\n%f", &d1, &d2);
    R = d1 * 2 + 2 * d2 * pi;
    printf("%f", R);
}