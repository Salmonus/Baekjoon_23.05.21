import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, min = 100, count = 0;
        for (int i = 0; i < 7; i++){
            n = sc.nextInt();
            if (n % 2 != 0){
                count += n;
                if (n <= min){
                    min = n;
                }
            }
            n = 0;
        }
    if (count == 0){
        System.out.print("-1");
    }else{
        System.out.printf("%d\n%d\n", count, min);
    }
    }
}