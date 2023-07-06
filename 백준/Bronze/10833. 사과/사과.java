import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      int T, N, A, count=0;
      Scanner s = new Scanner(System.in);
      T = s.nextInt();
      for(int i=0; i < T; i++){
        N = s.nextInt();
        A = s.nextInt();
        if (N <= A){
            count += A % N;
        }else{
            count += A;
        }
    }
      System.out.print(count);
    }
}