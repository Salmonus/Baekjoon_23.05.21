import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int A, B, C, max_val, other1, other2;

        for (int i = 1; i <= T; i++) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            C = scanner.nextInt();

            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            if ((A > B) && (A > C)) {
                max_val = A;
                other1 = B;
                other2 = C;
            } else if ((B > A) && (B > C)) {
                max_val = B;
                other1 = A;
                other2 = C;
            } else {
                max_val = C;
                other1 = A;
                other2 = B;
            }

            if (max_val * max_val == other1 * other1 + other2 * other2) {
                System.out.printf("Scenario #%d:\nyes\n\n", i);
            } else {
                System.out.printf("Scenario #%d:\nno\n\n", i);
            }
        }
        scanner.close();
    }
}
