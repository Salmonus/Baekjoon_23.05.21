import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, num, yes=0, no=0;
        n = sc.nextInt();
        for (int i = 0; i < n ; i++){
            num = sc.nextInt();
            if (num == 1){
                yes += 1;
            }else{
                no += 1;
            }
        }
        if (yes > no){
            System.out.print("Junhee is cute!");
        }else{
            System.out.print("Junhee is not cute!");
        }
    }
}