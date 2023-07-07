#include<stdio.h>

int main() {
    int T, a, b, fst, snd;
    scanf("%d", &T);
    
    for(int i=0; i < T; i++){
        scanf("%d %d", &a, &b);
        if (a == 1){
            fst = 500;
        }else if((3 >= a) && (a >= 2)){
            fst = 300;
        }else if(6 >= a && a >= 4){
            fst = 200;
        }else if(10 >= a && a >= 7){
            fst = 50;
        }else if(15 >= a && a >= 11){
            fst = 30; 
        }else if(21 >= a && a >= 16){
            fst = 10;
        }else{
            fst = 0;
        }
        
        if (b == 1){
            snd = 512;
        }else if(3 >= b && b >= 2){
            snd = 256;
        }else if(7 >= b && b >= 4){
            snd = 128;
        }else if(15 >= b && b >= 8){
            snd = 64;
        }else if(31 >= b && b >= 16){
            snd = 32; 
        }else{
            snd = 0;
        }
        
        printf("%d\n", fst * 10000 + snd * 10000);
    }
}
