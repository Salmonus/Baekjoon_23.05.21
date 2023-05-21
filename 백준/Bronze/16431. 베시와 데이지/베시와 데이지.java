import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int Bx = s.nextInt();
      int By = s.nextInt();
      int Dx = s.nextInt();
      int Dy = s.nextInt();
      int Zx = s.nextInt();
      int Zy = s.nextInt();
      int Bt, Dt;
      
    Bx = Zx >= Bx ? Zx - Bx : Bx - Zx; 
    By = Zy >= By ? Zy - By : By - Zy;
    Bt = Bx >= By ? Bx : By;
    Dx = Zx >= Dx ? Zx - Dx : Dx - Zx; 
    Dy = Zy >= Dy ? Zy - Dy : Dy - Zy;
    Dt = Dx + Dy; 
    if(Bt < Dt){
        System.out.println("bessie");
    }else if(Bt == Dt){
        System.out.println("tie");
    }else{
        System.out.println("daisy");
    }
    }
}