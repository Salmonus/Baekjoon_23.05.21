#include<stdio.h>

int main() {
    int BY, BM, BD, SY, SM, SD, D, D1;
    scanf("%d %d %d\n%d %d %d",&BY,&BM,&BD, &SY, &SM, &SD);
    D = SY - BY;
    if(BM > SM){
        D1 = D < 1 ? 0 : D-1;
        printf("%d\n", D1);
    }
    if(BM == SM){
        if(BD > SD){
            D1 = D < 1 ? 0 : D-1;
            printf("%d\n", D1);
        }else if(BD <= SD){
            printf("%d\n", D);
    }}
    if(BM < SM){
        printf("%d\n", D);
    }
    printf("%d\n", D + 1);
    printf("%d\n", D);
}