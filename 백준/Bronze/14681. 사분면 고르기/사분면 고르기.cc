#include<stdio.h>

int main() {
    int x,y;
    scanf("%d\n%d",&x,&y);
    if(x > 0){
        if(y > 0){printf("1");}
        if(y < 0){printf("4");}
    }else{
        if(y > 0){printf("2");}
        if(y < 0){printf("3");}
    }
}