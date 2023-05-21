import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int R1, S;
        Scanner sc = new Scanner(System.in);
        R1 = sc.nextInt();
        S = sc.nextInt();
        System.out.print(2 * S - R1);
    }
}