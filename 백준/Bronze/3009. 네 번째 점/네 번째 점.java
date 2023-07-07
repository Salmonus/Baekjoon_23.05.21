import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      int x1, x2, x3, x4, y1, y2, y3, y4;
      Scanner s = new Scanner(System.in);
      x1 = s.nextInt();
      y1 = s.nextInt();
      x2 = s.nextInt();
      y2 = s.nextInt();
      x3 = s.nextInt();
      y3 = s.nextInt();
      
      x4 = x1 == x3 ? x2 : (x1 == x2 ? x3 : x1);
      y4 = y1 == y3 ? y2 : (y1 == y2 ? y3 : y1);

      System.out.printf("%d %d", x4, y4);
    }
}