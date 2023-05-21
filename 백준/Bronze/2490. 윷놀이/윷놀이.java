import java.util.Scanner;


public class Main{
    
    public static void det(int a, int b, int c, int d) {
    int n = a + b + c + d;
    if(n == 4){
        System.out.println("E");
    }
    if(n == 0){
        System.out.println("D");
    }
    if(n == 1){
        System.out.println("C");
    }
    if(n == 2){
        System.out.println("B");
    }
    if(n == 3){
        System.out.println("A");
    }
}
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        for (int i = 0; i < 3; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            det(a,b,c,d);
        }
    }
}