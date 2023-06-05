import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, count=0, winner=0, max=0;
        for (int i = 0; i < 5; i++){
            for(int x = 0; x < 4; x++){
                n = sc.nextInt();
                count += n;
            }
            if (count > max){
                winner = i + 1;
                max = count;
            }
            count = 0;
        }
        System.out.printf("%d %d", winner, max);
    }
}