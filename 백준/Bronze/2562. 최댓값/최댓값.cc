#include <stdio.h>

int main(){
    int n, max=0, maxnum=0;
    for(int i=1;i<10;i++){
        scanf("%d", &n);
        if(n >= max){max = n; maxnum = i;}
    }
    printf("%d\n%d", max, maxnum);
}