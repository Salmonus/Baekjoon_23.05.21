import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N;){
        i += 1;
        for(int x = 0; x < i; x++){
            System.out.printf("*");
        }
        for(int space = 0; space < N*2-i*2; space++){
            System.out.printf(" ");
        }
        for(int x = 0; x < i; x++){
            System.out.printf("*");
        }
        System.out.printf("\n");
    }
    for(int i = N - 1; i > 0;){
        for(int x = 0; x < i; x++){
            System.out.printf("*");
        }
        for(int space = 0; space < N*2-i*2; space++){
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