import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();

        if (a + h == 9 && b + g == 9 && c + f == 9 && d + e == 9) {
            if (a == 1 && b == 2 && c == 3 && d == 4) {
                System.out.println("ascending");
            } else if (a == 8 && b == 7 && c == 6 && d == 5) {
                System.out.println("descending");
            } else {
                System.out.println("mixed");
            }
        } else {
            System.out.println("mixed");
        }
    }
}
