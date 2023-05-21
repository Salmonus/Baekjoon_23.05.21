import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int N = s.nextInt();
      int M = s.nextInt();
      int K = s.nextInt();
      int O,X, R;
      
      O = M >= K ? K : M;
      X = K >= M ? N - K : N - M; 
      R = O + X;
      System.out.println(R);
    }
}