import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int a = myObj.nextInt();
    int b = myObj.nextInt();
    int c = myObj.nextInt();
    int R;
    if(a==b && b==c && c==a){
        System.out.println((10000 + 1000*a));
    }else if(a==b && b != c || c==a && a != b){
        System.out.println((1000 + 100*a));
    }else if(b==c && c!=a){
        System.out.println((1000 + 100*b));
    }else{
        if(a - b > 0 && a - c > 0){
            System.out.println((100*a));
        }else if(b - a > 0 && b - c > 0){
            System.out.println((100*b));
        }else if(c - a > 0 && c - b > 0){
            System.out.println((100*c));
        }
    }
    }
}