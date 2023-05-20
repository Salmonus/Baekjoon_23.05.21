import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y;
        int count = sc.nextInt() + 1; 
        for(int i = 1 ; i != count; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i, x, y, x + y);
        }
        
    } 
}