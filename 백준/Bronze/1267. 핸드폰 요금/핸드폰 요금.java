import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        int A, M = 0, N = 0;
        
        for (int i = 0; i < T; i++) {
            A = scanner.nextInt();
            N += (A / 30 + 1) * 10;
            M += (A / 60 + 1) * 15;
        }
        if (M < N) {
            System.out.printf("M %d\n", M);
        } else if (M > N) {
            System.out.printf("Y %d\n", N);
        } else {
            System.out.printf("Y M %d\n", M);
        }
        scanner.close();
    }
}
