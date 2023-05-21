import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int A = myObj.nextInt();
    int B = myObj.nextInt();
    int C = myObj.nextInt();
    int D = myObj.nextInt();
    int P = myObj.nextInt();
    int X, Y, R;
    X = A * P;
    Y = P <= C ? B : B + D * (P - C);
    R = X >= Y ? Y : X;
    System.out.println(R);
    }
}