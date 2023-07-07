import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      int A, B, C, max_val, other1, other2;
    Scanner s = new Scanner(System.in);
    while (true){
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        if (A == 0 && B == 0 && C == 0){
            break;
        }
        
        if ((A > B) && (A > C)){
            max_val = A;
            other1 = B;
            other2 = C;
        }else if ((B > A) && (B > C)){
            max_val = B;
            other1 = A;
            other2 = C;
        }else{
            max_val = C;
            other1 = A;
            other2 = B;
        }
        
        if (max_val * max_val == other1 * other1 + other2 * other2){
            System.out.println("right");
        }else{
            System.out.println("wrong");
        }
    }
    }
}