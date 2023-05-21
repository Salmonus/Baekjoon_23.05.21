import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int a = myObj.nextInt();
    int b = myObj.nextInt();
    int c = myObj.nextInt();
    if(a + b + c == 180){
    if(a==b && b==c && c==a){
        System.out.println("Equilateral");
    }else if(a==b && b != c || b==c && c!=a || c==a && a != b){
        System.out.println("Isosceles");
    }else{
        System.out.println("Scalene");
    }
    }else{
        System.out.println("Error");
    }
    }
}