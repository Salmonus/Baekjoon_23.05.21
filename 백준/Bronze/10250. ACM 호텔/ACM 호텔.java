import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    int H, W, N, T;
    Scanner s = new Scanner(System.in);
    T = s.nextInt();
    for (int i=0; i < T; i++){
        H = s.nextInt();
        W = s.nextInt();
        N = s.nextInt();
        int last = N % H != 0 ? N / H + 1 : N / H;
        int first = N % H != 0 ? N % H : H;
        System.out.printf("%d\n", first * 100 + last);
    }
    }
}