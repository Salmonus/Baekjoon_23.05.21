import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N;){
        for(int x = 0; x < N-i -1; x++){
            System.out.printf(" ");
        }
        System.out.printf("*");
        for(int s = 0; s < i; s ++){
            System.out.printf(" ");
            System.out.printf("*");
        }
        System.out.println();
        i += 1;
    }
    }
}