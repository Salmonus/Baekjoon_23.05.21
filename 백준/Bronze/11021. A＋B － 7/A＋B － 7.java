import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y;
        int count = sc.nextInt();   
        for (int i=0;i!=count; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.printf("Case #%d: %d\n", i + 1, x + y);
        }
        
    }
}