import java.util.Scanner;

public class Main {
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();
            if (input.equals("0")) {
                break;
            }

            int len = input.length();
            int res = 0;

            for (int i = 0; i < len; i++) {
                int digit = Integer.parseInt(Character.toString(input.charAt(i)));
                res += digit * factorial(len - i);
            }

            System.out.println(res);
        }

        scanner.close();
    }
}
