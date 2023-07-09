import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter(",|\n");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x + y);
        }
        scanner.close();
    }
}
