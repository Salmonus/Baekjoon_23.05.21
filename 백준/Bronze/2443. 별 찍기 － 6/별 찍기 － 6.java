import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=N ; i > 0;){
            for (int y = 1; y < N - i + 1; y ++){
                System.out.print(" ");
            }for (int x = 1; x < 2 * i ; x ++){
                System.out.print("*");
            }
            System.out.println();
            i -= 1;
        }
    }
}