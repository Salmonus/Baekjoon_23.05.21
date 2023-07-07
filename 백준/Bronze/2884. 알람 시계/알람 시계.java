import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      int H, M;
      Scanner s = new Scanner(System.in);
      
      H = s.nextInt();
      M = s.nextInt();
      
    if (M < 45){
        H = H > 0 ? H - 1 : 23;
        M += 15;
    }else{
        M -= 45;
    }

      System.out.printf("%d %d", H, M);
    }
}