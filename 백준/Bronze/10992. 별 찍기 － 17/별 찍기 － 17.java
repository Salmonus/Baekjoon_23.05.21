import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N ==1) System.out.printf("*");
        N -= 1;
    for(int i = 0; i < N;){
        i += 1;
        for(int x = 0; x < N-i+1; x++){
            System.out.printf(" ");
        }
        System.out.printf("*");
        for(int s = 0; s < (i - 1)*2 -1; s ++){
            System.out.printf(" ");
        }
        if(i != 1) System.out.printf("*");
        System.out.printf("\n");
        if(i == N){
            for(int a= 0; a < N*2+1; a++){
                System.out.printf("*");
            }
        }
    }
    }
}