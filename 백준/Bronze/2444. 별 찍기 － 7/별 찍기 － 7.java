import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i =1; i < N; i++){
            for (int y = 0; y < N - i; y ++){
                System.out.print(" ");
            }
            for (int x = 0; x < 2 * i - 1; x ++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int p = N; p > 0; p--){
            for (int q = 0; q < N - p; q ++){
                System.out.print(" ");
            }
            for (int r = 0; r < 2 * p - 1; r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}