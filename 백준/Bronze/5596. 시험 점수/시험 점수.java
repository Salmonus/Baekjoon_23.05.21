import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int S1 = myObj.nextInt();
    int S2 = myObj.nextInt();
    int S3 = myObj.nextInt();
    int S4 = myObj.nextInt();
    int T1 = myObj.nextInt();
    int T2 = myObj.nextInt();
    int T3 = myObj.nextInt();
    int T4 = myObj.nextInt();
    int S, T, R;
    S = S1 + S2 + S3 + S4;
    T = T1 + T2 + T3 + T4;
    R = S >= T ? S : T;
    System.out.println(R);
    }
}