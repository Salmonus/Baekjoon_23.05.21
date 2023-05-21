Bx, By = map(int, input().split())
Dx, Dy = map(int, input().split())
Zx, Zy = map(int, input().split())
Bx = Zx - Bx if Zx >= Bx else Bx - Zx; 
By = Zy - By if Zy >= By else By - Zy;
Bt = Bx if Bx >= By else By;
Dx = Zx - Dx if Zx >= Dx else Dx - Zx; 
Dy = Zy - Dy if Zy >= Dy else Dy - Zy;
Dt = Dx + Dy; 
if Bt < Dt:
    print("bessie")
elif Bt == Dt:
    print("tie");
else:
    print("daisy");