#include <stdio.h>

int main(){
    int N, count = 0;
    scanf("%d", &N);

    N = N - 1 > 0 ? N - 1 : 0;

    if(N == 0){
        printf("1\n");
    } else {
        while (N > 0){
            N -= count * 6;
            count += 1;
        }
        printf("%d\n", count);
    }

    return 0;
}
