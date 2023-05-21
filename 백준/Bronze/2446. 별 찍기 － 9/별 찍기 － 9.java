import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = N; i > 0;){
            for (int y = 0; y < N - i; y ++){
                System.out.print(" ");
            }
            for (int x = 0; x < 2 * i - 1; x++){
                System.out.print("*");
            }
            System.out.println();
            i -= 1;
        }
        for (int i = 1; i < N; ){
            i += 1;
            for(int y = 0; y < N - i; y++){
                System.out.print(" ");
            }
            for (int x = 0; x < 2 * i - 1; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}