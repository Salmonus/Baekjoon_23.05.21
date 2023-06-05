#include <stdio.h>

int main(){
    int n, num, yes=0, no=0;
    scanf("%d", &n);
    for(int i=0; i < n; i++){
        scanf("%d", &num);
        if(num == 1){
            yes += 1;
        }else{no += 1;}
    }
    if(yes > no){printf("Junhee is cute!");}
    else if(yes < no){printf("Junhee is not cute!");}
    return 0;
}