#include <stdio.h>

int main(){
    int on, off, one, two, three, four;
    scanf("%d %d", &on, &off);
    one = -1 * on + off;
    scanf("%d %d", &on, &off);
    two = one + -1 * on + off;
    scanf("%d %d", &on, &off);
    three = two + -1 * on + off;
    scanf("%d %d", &on, &off);
    four = three + -1 * on + off;
    
    if(one > two && one >  three && one > four){
        printf("%d", one);
    }else if(two > one && two >  three && two > four){
        printf("%d", two);
    }else if(three > two && three >  one && three > four){
        printf("%d", three);
    }else if(four > two && four >  three && four > one){
        printf("%d", four);
    }
}