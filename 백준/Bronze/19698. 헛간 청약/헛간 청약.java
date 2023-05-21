import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int N = myObj.nextInt();
    int W = myObj.nextInt();
    int H = myObj.nextInt();
    int L = myObj.nextInt();
    int R;
    R = (H/L) * (W/L);
    R = R >= N ? N : R;
    System.out.println(R);
    }
}
