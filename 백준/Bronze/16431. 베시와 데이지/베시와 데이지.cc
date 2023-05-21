#include <stdio.h>

int main(){
    int Bx, By, Dx, Dy,Zx, Zy, Bt, Dt;
    scanf("%d %d\n%d %d\n%d %d", &Bx, &By, &Dx, &Dy, &Zx, &Zy);
    Bx = Zx >= Bx ? Zx - Bx : Bx - Zx; 
    By = Zy >= By ? Zy - By : By - Zy;
    Bt = Bx >= By ? Bx : By;
    Dx = Zx >= Dx ? Zx - Dx : Dx - Zx; 
    Dy = Zy >= Dy ? Zy - Dy : Dy - Zy;
    Dt = Dx + Dy; 
    if(Bt < Dt){
        printf("bessie");
    }else if(Bt == Dt){
        printf("tie");
    }else{
        printf("daisy");
    }
}