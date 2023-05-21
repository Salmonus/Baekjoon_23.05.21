import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int A, I, M;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        I = sc.nextInt();
        System.out.print(A * (I-1) + 1);
    }
}