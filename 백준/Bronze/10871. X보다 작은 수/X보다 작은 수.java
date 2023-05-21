import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N, X, SOO;
        N = sc.nextInt();
        X = sc.nextInt();
        for (int i= 0; i < N; i++){
            SOO = sc.nextInt();
            if(SOO < X){
                System.out.printf("%d ", SOO);
            }
        }
    }
}