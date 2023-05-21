import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int S = s.nextInt();
      int T = s.nextInt();
      int D = s.nextInt();
      int R;
      R = (D*T) / (2 * S);
      System.out.println(R);
    }
}