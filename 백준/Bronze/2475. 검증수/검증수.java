import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        System.out.print((a*a + b*b + c*c + d*d + e*e)%10);
    }
}