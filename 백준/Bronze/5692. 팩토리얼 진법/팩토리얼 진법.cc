#include <stdio.h>

int factorial(int n);

int main() {
    char T[6];
    while(1) {
        scanf("%s", T);
        if(T[0] == '0' && T[1] == '\0') {
            break;
        }

        int len = 0;
        while(T[len] != '\0') {
            len++;
        }

        int res = 0;
        for(int i = 0; i < len; i++) {
            int digit = T[i] - '0';
            res += digit * factorial(len - i);
        }

        printf("%d\n", res);
    }
    return 0;
}

int factorial(int n) {
    int fact = 1;
    for(int i = 2; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
