import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    double A = myObj.nextInt();
    double B = myObj.nextInt();
    double C = myObj.nextInt();
    double a,b,R;
    int N;
    a = A * B / C;
    b = A / B * C;
    R = a >= b ? a : b;
    N = (int)R;
    System.out.println(N);
    }
}