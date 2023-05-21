import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int L = myObj.nextInt();
    int A = myObj.nextInt();
    int B = myObj.nextInt();
    int C = myObj.nextInt();
    int D = myObj.nextInt();
    int M, G, R;
    M = B % D == 0 ? B / D : B / D + 1;
    G = A % C == 0 ? A / C : A / C + 1;
    R = L - (M >= G ? M : G); 
    System.out.println(R);
    }
}