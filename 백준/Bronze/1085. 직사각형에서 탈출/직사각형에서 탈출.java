import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      int x, y, w, h;
      Scanner s = new Scanner(System.in);
      
      x = s.nextInt();
      y = s.nextInt();
      w = s.nextInt();
      h = s.nextInt();
      
      int min_x = x < w - x ? x : w - x;
      int min_y = y < h - y ? y : h - y;

      System.out.printf("%d", min_x < min_y ? min_x : min_y);
    }
}