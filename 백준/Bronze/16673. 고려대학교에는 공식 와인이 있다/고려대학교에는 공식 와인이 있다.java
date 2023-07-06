import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      int C, K, P, count=0;
      Scanner s = new Scanner(System.in);
      C = s.nextInt();
      K = s.nextInt();
      P = s.nextInt();
    
    for (int i=1; i < C + 1; i++){
        count += K * i + P * (i * i);
    }
      
      System.out.print(count);
    }
}