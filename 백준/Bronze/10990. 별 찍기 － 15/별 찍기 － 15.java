import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N;){
        i += 1;
        for(int x = 0; x < N-i; x++){
            System.out.printf(" ");
        }
        System.out.printf("*");
        for(int s = 0; s < (i - 1)*2 -1; s ++){
            System.out.printf(" ");
        }
        if(i != 1) System.out.printf("*");
        System.out.println();
    }
    }
}