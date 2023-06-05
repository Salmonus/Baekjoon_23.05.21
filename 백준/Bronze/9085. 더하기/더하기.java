import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, num, a, count = 0;
        n = sc.nextInt();
        for(int i = 0; i < n; i ++){
            num = sc.nextInt();
            for (int y = 0; y < num; y++){
                a = sc.nextInt();
                count += a;
            }
            System.out.printf("%d\n", count);
            count = 0;
        }
    }
}