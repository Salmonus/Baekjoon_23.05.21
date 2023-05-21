import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int A = s.nextInt();
      int B = s.nextInt();
      int C = s.nextInt();
      int D = s.nextInt();
      int E = s.nextInt();
      int T;
      if(A > 0){
        T = (B - A) * E;
    }else if(A == 0){
        T = (B - A) * E + D;
    }else{
        T = -1 * A * C + D + B * E;
    }
    System.out.println(T);
    }
}