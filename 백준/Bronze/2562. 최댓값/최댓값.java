import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int maxIndex = 1; 

        for (int i = 2; i <= 9; i++) { 
            int current = scanner.nextInt();
            if (current > max) {
                max = current;
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}
