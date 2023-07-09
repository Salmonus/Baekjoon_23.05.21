import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();

        int reversedFirst = (first.charAt(2) - '0') * 100 + (first.charAt(1) - '0') * 10 + (first.charAt(0) - '0');
        int reversedSecond = (second.charAt(2) - '0') * 100 + (second.charAt(1) - '0') * 10 + (second.charAt(0) - '0');

        if (reversedFirst > reversedSecond) {
            System.out.println(reversedFirst);
        } else {
            System.out.println(reversedSecond);
        }
    }
}
