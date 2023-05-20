import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int x, y;
        int count;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        for (int i = 0; i != count; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x + y);
        }
    }
}