import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    double P = myObj.nextInt();
    double M = myObj.nextInt();
    double a,b;
    int A, B, a1,b1;
    a = ((P + M)/2);
    b = ((P - M)/2);
    a1 = (int)((P + M)/2);
    b1 = (int)((P - M)/2);
    if(a == a1 && b == b1){
    if(P >= M){
        A = (int)a; B = (int)b;
        if(a >= b){
            System.out.println(A + " " + B);   
        }else{
            System.out.println(B + " " + A);
        }
    }else if(P < M){
        System.out.println("-1");
    }}else{
        System.out.println("-1");
    }
    }
}