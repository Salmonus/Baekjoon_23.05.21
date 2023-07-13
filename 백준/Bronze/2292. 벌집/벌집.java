import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        N = N - 1 > 0 ? N - 1 : 0;

        if(N == 0){
            System.out.println(1);
        } else {
            while (N > 0){
                N -= count * 6;
                count += 1;
            }
            System.out.println(count);
        }
    }
}
