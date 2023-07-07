import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int l = 0; l < T; l++) {
            long res = 1;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            a = a % 10;
            if (a == 0) {
                System.out.println("10");
            } else if (b == 0) {
                System.out.println("1");
            } else {
                b = b % 4 + 4;
                for (int i = 0; i < b; i++) {
                    res *= a;
                    res = res % 10;
                }
                System.out.println(res);
            }
        }
        scanner.close();
    }
}
