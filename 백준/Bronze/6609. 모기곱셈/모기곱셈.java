import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int M = sc.nextInt();
            int P = sc.nextInt();
            int L = sc.nextInt();
            int E = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int tempL = M * E;
                int tempM = P / S;
                P = L / R;
                L = tempL;
                M = tempM;
            }
            System.out.println(M);
        }
    }
}
