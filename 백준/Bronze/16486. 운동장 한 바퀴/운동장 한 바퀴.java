import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      float d1 = s.nextFloat();
      float d2 = s.nextFloat();
      double R, pi = 3.141592;
      R = d1 * 2 + 2 * d2 * pi;
      System.out.println(R);
    }
}