#include <stdio.h>

int main(){
    int n, r, e, c;
    scanf("%d", &n);
    for(int i=0; i < n; i++){
        scanf("%d %d %d", &r, &e, &c);
        if(e - (r + c) > 0){printf("advertise\n");}
        else if(e - (r + c) < 0){printf("do not advertise\n");}
        else if(e - (r + c) == 0){printf("does not matter\n");}
    }

    return 0;
}