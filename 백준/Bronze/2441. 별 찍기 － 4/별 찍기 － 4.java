import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = N; i > 0; ){
        for(int y = 0; y < N - i; y ++){
            System.out.printf(" ");
        }
        for(int x = 0; x < i; x++){
            System.out.printf("*");
        }
        System.out.printf("\n");
        i -= 1;
    }
    }
}