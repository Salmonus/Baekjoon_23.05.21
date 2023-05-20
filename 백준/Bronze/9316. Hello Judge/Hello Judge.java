import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() + 1;
        for (int i = 1; i < N; i++){
            System.out.printf("Hello World, Judge %d!\n", i);
        }
    }
}